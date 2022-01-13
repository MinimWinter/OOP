package drawing;

public class ComposedObject {
    private Rectangle rectangle;
    private Cross cross;
    public ComposedObject(Rectangle rectangle, Cross cross)
    {
        this.rectangle = new Rectangle(rectangle);
        this.cross = new Cross(cross);
    }

    public Rectangle getRectangle(){
        return rectangle;
    }

    public Cross getCross(){
        return cross;
    }

    public void draw(){
        getRectangle().draw();
        getCross().draw();
    }

    public void erase(){
        getRectangle().erase();
        getCross().erase();
    }

    public void moveComposedObject(int dx, int dy){
        getRectangle().moveRectangle(dx, dy);
        getCross().moveCross(dx, dy);
    }
}
