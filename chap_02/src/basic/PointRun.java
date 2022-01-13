package basic;

public class PointRun {

    public static void main(String[] args) {
        Point pointA = new Point(200,200);
        Point pointB = new Point(500,600);
        Point pointC = pointA.addation(pointB);

        System.out.println("Original points\n*************");
        pointA.print();
        pointB.print();
        pointC.print();
        System.out.println("******************");

        System.out.println("After move\n**************");
        pointB.move(100, 200);
        pointB.print();
        pointA.move(-20, -40);
        pointA.print();
        pointA.setX(222);
        pointA.setY(333);
        pointA.print();

        int distance1 = pointA.distance(pointB);
        int distance2 = pointB.distance(pointA);
        int distance3 = pointB.distance(pointB);

        System.out.println("\nDistance between A and B is: " + distance1);
        System.out.println("\nDistance between B and A is: " + distance2);
        System.out.println("\nDistance between B and B is: " + distance3);



    }
}
