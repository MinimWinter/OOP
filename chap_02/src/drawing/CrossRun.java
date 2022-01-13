package drawing;

import java.awt.Color;

public class CrossRun {
    public static void main(String[] agr)
    {
        PointG point = new PointG(100, 200, Color.red);
        Cross cross = new Cross(point, 30, 40);
        cross.draw();
        cross.moveCross(40, 200);
        point.move(200, 160);
        cross.draw();
        System.out.println("Center: " + cross.getCenter().toString());
    }
}
