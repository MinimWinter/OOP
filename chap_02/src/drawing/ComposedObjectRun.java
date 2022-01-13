package drawing;

import java.awt.*;

public class ComposedObjectRun {
    public static void main(String[] agr) {
        PointG pA = new PointG(100, 200, Color.red);
        PointG pB = new PointG(400, 250, Color.blue);
        Rectangle rc = new Rectangle(pA, pB);

        PointG point = new PointG(300, 225, Color.green);
        Cross cross = new Cross(point, 30, 40);

        ComposedObject cObject = new ComposedObject(rc, cross);
        cObject.draw();
        cObject.moveComposedObject(10,10);
    }
}
