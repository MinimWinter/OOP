package messenger;

public class Space {
    public static Point translate(Point p, Vector v)
    {
        p = new Point(p);
        p.x = p.x + v.getMagnitude();
        p.y = p.y + v.getDirection();
        p.z = p.z + v.getMagnitude() + v.getDirection();
        return p;
    }
}
