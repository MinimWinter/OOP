package interfaceAL;

import compound_interface.Cross;
import compound_interface.IShape;
import compound_interface.PointG;
import compound_interface.Rectangle;

import java.util.ArrayList;

public class CompoundObject {
    private IShape[] array = new IShape[3];
    private ArrayList<IShape> arrayList;


    public CompoundObject(){
        /*array[0] = new Rectangle(new PointG(100, 100, Color.blue),
                new PointG(200,200, Color.blue));
        array[1] = new Cross(new PointG(120, 150, Color.green), 20,40);
        array[2] = new Cross(new PointG(189, 180, Color.red), 10, 20);*/
        arrayList = new ArrayList<IShape>();
    }


    public void draw(){
        /*for(int i = 0; i < array.length; i++)
        {
            array[i].draw();
        }*/
        for(int i = 0; i < arrayList.size(); i++)
        {
            arrayList.get(i).draw();
        }
    }

    public void erase(){
       /* for(int i = 0; i < array.length; i++)
        {
            array[i].erase();
        }*/
        for(int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).erase();
        }
    }

    public void move(int dx, int dy)
    {
       /* for(int i = 0; i < array.length; i++)
        {
            array[i].move(dx, dy);
        }*/
        for(int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).move(dx, dy);
        }
    }

    public void compoundObjectMove(int dx, int dy)
    {
        erase();
        move(dx, dy);
        PointG.delay(30);
        draw();
    }

    public void add(Rectangle rc){
        arrayList.add(rc);
    }
    public void add(Cross cross)
    {
        arrayList.add(cross);
    }

}
