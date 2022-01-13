package AbstractPK;
import java.awt.Color;

public abstract class Shape {
    private Color color;

    public Shape(Color color) { this.color = color; }

    public Color getColor()
    {
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    //abstract methods
    public abstract void draw();

    public abstract void erase();

    public abstract void move(int dx, int dy);

    //conctere methods
    public void print(){
        System.out.println(toString());
    }

    public String toString(){
        return "Color: " + getColor();
    }
}
