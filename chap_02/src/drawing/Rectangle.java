package drawing;

public class Rectangle {
    private PointG upperLeft;
    private PointG lowerRight;

    public Rectangle(PointG left, PointG right)
    {
        upperLeft = new PointG(left);
        lowerRight = new PointG(right);
    }

    //copy constructor
    public Rectangle(Rectangle rc){
        upperLeft = new PointG(rc.getUpperLeft());
        lowerRight = new PointG(rc.getLowerRight());
    }

    public void setUpperLeft(PointG point){
        upperLeft = new PointG(point);
    }

    public PointG getUpperLeft()
    {
        return upperLeft;
    }

    public void setLowerRight(PointG point)
    {
        lowerRight = new PointG(point);
    }

    public PointG getLowerRight()
    {
        return lowerRight;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("");
        sb.append("Rectangle:\n");
        sb.append(getUpperLeft().toString());
        sb.append("\n");
        sb.append(getLowerRight().toString());
        return sb.toString();
    }

    public void print(){
        System.out.println(toString());
    }

    public int lengthX()
    {
        return getLowerRight().getX() - getUpperLeft().getX();
    }

    public int lengthY(){
        return getLowerRight().getY() - getUpperLeft().getY();
    }

    public void draw(){
        //horizontal lines
        for(int i = 0; i < lengthX(); i++){
            getUpperLeft().draw(i, 0);
            getLowerRight().draw(-i, 0);
            PointG.delay(5);
        }
        //vertical lines
        for(int i = 0; i < lengthY(); i++)
        {
            getUpperLeft().draw(0, i);
            getLowerRight().draw(0, -i);
            PointG.delay(5);
        }
    }

    public void erase()
    {
        //horizontal lines
        for(int i = 0; i < lengthX(); i++){
            getUpperLeft().erase(i, 0);
            getLowerRight().erase(-i, 0);
            PointG.delay(5);
        }
        //vertical lines
        for(int i = 0; i < lengthY(); i++)
        {
            getUpperLeft().erase(0, i);
            getLowerRight().erase(0, -i);
            PointG.delay(5);
        }
    }

    public void move(int dx, int dy)
    {
        getUpperLeft().move(dx, dy);
        getLowerRight().move(dx, dy);
    }

    public void moveRectangle(int dx, int dy){
        erase();
        move(dx, dy);
        draw();
    }
}
