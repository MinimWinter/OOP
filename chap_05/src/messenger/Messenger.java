package messenger;

public class Messenger {
    public static void main(String[] agr)
    {
        Point p1 = new Point(10,20,30);
        Vector v1 = new Vector(5,8);

        Point p2 = Space.translate(p1, v1);
        String result = "p1: " + p1 + "\np2: " + p2;
        System.out.println(result);
    }
}
