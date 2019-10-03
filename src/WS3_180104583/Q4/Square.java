package WS3_180104583.Q4;

public class Square {
    private int side;

    public Square() {
    }

    public Square(int side) {
        this.side = side;
    }

    public double getSquareArea() {
        return side * side;
    }

    public String toString() {
        return "side=" + side + ", area= " + getSquareArea();
    }
}
