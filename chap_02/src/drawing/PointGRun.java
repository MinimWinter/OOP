package drawing;

public class PointGRun {
    public static void main(String[] args)
    {
        PointG point = new PointG(100, 100, java.awt.Color.red);
        point.draw();
        point.move(0, 1);
        point.draw();
        point.move(0, 1);
        point.draw();
        PointG pointA = new PointG(200, 300, java.awt.Color.blue);
        pointA.draw();
        pointA.move(1, 1);
        pointA.draw();
        pointA.move(1, 1);
        pointA.draw();
        point.move(10, 10);
        for (int i = 0; i < 100; i++) {
            point.draw(0, i);
            PointG.delay(20);
        }
        PointG p1 = new PointG(200, 300, "modra");
        for(int i = 0; i < 50; i++){
            p1.draw(i, -i);
            PointG.delay(20);
        }

    }
}
