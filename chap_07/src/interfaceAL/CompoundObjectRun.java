package interfaceAL;
import java.awt.Color;


import compound_interface.Cross;
import compound_interface.PointG;
import compound_interface.Rectangle;


public class CompoundObjectRun {
    public static void main(String[] args){
        CompoundObject co = new CompoundObject();
        co.add(new Rectangle(new PointG(100, 100, Color.blue),
                new PointG(200,200, Color.blue)));
        co.add(new Cross(new PointG(120, 150, Color.green),20,40));
        co.draw();
        PointG.delay(20);
        co.compoundObjectMove(150,120);
    }
}
