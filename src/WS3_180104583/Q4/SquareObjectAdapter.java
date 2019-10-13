package WS3_180104583.Q4;

public class SquareObjectAdapter extends Square {
    private Circle circle;
    private int side;

    public SquareObjectAdapter(Circle circle) {
        side = circle.getRadius() * 2;
        this.circle = circle;
    }

    @Override
    public double getSquareArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "side=" + side + ", area= " + getSquareArea();
    }
}
