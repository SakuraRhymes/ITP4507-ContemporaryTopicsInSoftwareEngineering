package WS3_180104583.Q4;

public class Lab03Q4 {
    public static void main(String[] args) {
        Square square = new SquareObjectAdapter(new Circle(10));
        ShowSquareInfo.printSquare(square);
    }
}
