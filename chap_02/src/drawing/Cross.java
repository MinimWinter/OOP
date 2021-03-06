package drawing;

public class Cross {
    private PointG center;
    private int lengthX;
    private int lengthY;

    public Cross(PointG point, int x, int y)
    {
        center = new PointG(point);
        lengthX = x;
        lengthY = y;
    }

    //copy constructor
    public Cross(Cross cross)
    {
        center = new PointG(cross.getCenter());
        lengthX = cross.getLengthX();
        lengthY = cross.getLengthY();
    }

    public PointG getCenter()
    {
        return center;
    }

    public int getLengthX()
    {
        return lengthX;
    }

    public int getLengthY()
    {
        return lengthY;
    }

    public String toString()
    {
        return String.format("Cross center: %s lengthX: %d lengthY: %d", getCenter(), getLengthX(), getLengthY());
    }

    public void print()
    {
        System.out.println(this.toString());
    }

    public void draw(){
        //horizontal axis
        for(int i = 0; i < getLengthX() * 2 + 1; i++)
        {
            getCenter().draw(-getLengthX() + i, 0);
            PointG.delay(40);
        }
        //vertical axis
       for(int i = 0; i < getLengthY() * 2 + 1; i++)
       {
           getCenter().draw(0, -getLengthY() + i);
           PointG.delay(40);
       }
    }

    public void erase()
    {
        //horizontal axis
        for(int i = 0; i < getLengthX() * 2 + 1; i++)
        {
            getCenter().erase(-getLengthX() + i, 0);
            PointG.delay(40);
        }
        //vertical axis
        for(int i = 0; i < getLengthY() * 2 + 1; i++)
        {
            getCenter().erase(0, -getLengthY() + i);
            PointG.delay(40);
        }
    }

    public void moveCross(int dx, int dy)
    {
        this.erase();
        this.getCenter().move(dx, dy);
        this.draw();
    }
}
