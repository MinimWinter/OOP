package messenger;

public class Vector {
    private int magnitude, direction;

    public Vector(int magnitude, int direction)
    {
        this.magnitude = magnitude;
        this.direction = direction;
    }

    public int getMagnitude(){ return magnitude; }
    public int getDirection(){ return direction; }
}
