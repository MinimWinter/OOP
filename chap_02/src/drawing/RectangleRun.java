package drawing;

import java.awt.*;

public class RectangleRun {
    public static void main(String[] agr)
    {
        PointG pA = new PointG(100, 200, Color.red);
        PointG pB = new PointG(400, 250, Color.blue);

        Rectangle rc = new Rectangle(pA, pB);
        rc.draw();
        rc.moveRectangle(10,10);

    }
}
