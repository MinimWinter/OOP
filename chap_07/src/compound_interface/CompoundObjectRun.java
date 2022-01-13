package compound_interface;

public class CompoundObjectRun {
    public static void main(String[] args){
        CompoundObject co = new CompoundObject();
        co.draw();
        PointG.delay(20);
        co.compoundObjectMove(150,120);
    }
}
