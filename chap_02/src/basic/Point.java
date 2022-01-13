package basic;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
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
        return "\nX = " + getX() + "\nY = " + getY();
    }

    public void print()
    {
        System.out.println(this.toString());
    }

    public void move(int dx, int dy)
    {
        setX(getX() + dx);
        setY(getY() + dy);
    }

    public int distance(Point point)
    {
        int dx = this.getX() - point.getX();
        int dy = this.getY() - point.getY();
        return (int) Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));

    }

    public Point addation(Point point)
    {
        int newX = getX() + point.getX();
        int newY = getY() + point.getY();

        return new Point(newX, newY);
    }
}
