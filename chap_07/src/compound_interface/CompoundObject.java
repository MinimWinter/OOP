package compound_interface;


import java.awt.*;

public class CompoundObject {
    private IShape[] array = new IShape[3];

    public CompoundObject(){
        array[0] = new Rectangle(new PointG(100, 100, Color.blue),
                new PointG(200,200, Color.blue));
        array[1] = new Cross(new PointG(120, 150, Color.green), 20,40);
        array[2] = new Cross(new PointG(189, 180, Color.red), 10, 20);
    }

    public void draw(){
        for(int i = 0; i < array.length; i++)
        {
            array[i].draw();
        }
    }

    public void erase(){
        for(int i = 0; i < array.length; i++)
        {
            array[i].erase();
        }
    }

    public void move(int dx, int dy)
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i].move(dx, dy);
        }
    }

    public void compoundObjectMove(int dx, int dy)
    {
        erase();
        move(dx, dy);
        PointG.delay(30);
        draw();
    }
}
