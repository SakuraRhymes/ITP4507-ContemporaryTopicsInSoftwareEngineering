package WS3_180104583.Q1;

public class Main {
    public static void main(String[] args) {
        NewCircle circleObjectAdapter = new CircleObjectAdapter(new OldCircleImpl(10, 15, 25.5));
        PrintCircle.printCircle(circleObjectAdapter);

        NewCircle circleClassAdapter = new CircleClassAdapter(10, 15, 25.5);
        PrintCircle.printCircle(circleClassAdapter);
    }
}
