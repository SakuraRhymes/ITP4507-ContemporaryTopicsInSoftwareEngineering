package WS3_180104583.Q4;

public class SquareObjectAdapter extends Square {
    private Circle circle;

    public SquareObjectAdapter(Circle circle) {
        super(circle.getRadius() * 2);
        this.circle = circle;
    }
}
