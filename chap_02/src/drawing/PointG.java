package drawing;

import java.awt.Color;

public class PointG {
    private int x;
    private int y;
    private Color color;
    private BaseCanvas canvas = Gui.getInstance().getCanvas();
    private Color backGroundColor = Color.white;

    public PointG(){
        this(0, 0, Color.red);
    }

    public PointG(int x, int y, Color color)
    {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public PointG(int x, int y, String color){
        this.x = x;
        this.y = y;
        setColor(stringToColor(color));
    }

    //Copy constructor
    public PointG(PointG point){
        setX(point.getX());
        setY(point.getY());
        setColor(point.getColor());
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    public Color getColor()
    {
        return color;
    }

    public void setX(int valueX)
    {
        this.x = valueX;
    }

    public void setY(int valueY)
    {
        this.y = valueY;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public String toString()
    {
        return "\nX = " + getX() + "\nY = " + getY() + "\nColor: " + getColor();
    }

    public void print()
    {
        System.out.println(this.toString());
    }

    public BaseCanvas getCanvas()
    {
        return canvas;
    }

    public Color getBackGroundColor()
    {
        return backGroundColor;
    }

    public void move(int dx, int dy)
    {
        setX(getX() + dx);
        this.setY(getY() + dy);
    }

    public void draw(){
        this.getCanvas().putPixel(getX(), getY(), getColor());
    }

    public void draw(int dx, int dy){
        getCanvas().putPixel(getX() + dx,getY() + dy, getColor());
    }

    public void erase(){
        this.getCanvas().putPixel(getX(), getY(), getBackGroundColor());
    }

    public void erase(int dx, int dy){
        getCanvas().putPixel(getX() + dx, getY() + dy, getBackGroundColor());
    }

    public static void delay(int time){
        try{
            Thread.sleep(time);
        }catch(InterruptedException e){
            System.out.println("Error in delay()");
        }
    }

    public Color stringToColor(String color1)
    {
        switch(color1){
            case "cervena": return Color.red;
            case "cerna": return Color.black;
            case "modra": return Color.blue;
            case "zelena": return Color.green;
            default: return Color.red;
        }
    }
}
