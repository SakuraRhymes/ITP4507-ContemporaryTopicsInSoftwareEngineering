package WS1_180104583.Q2b;

public class Lab01Q2b {
    public static void main(String[] args) {
        Control control = new Control();
        Shape[] shapeObjects = {
                new Rectangle(10, 5, new Point(3, 7)),
                new Circle(6, new Point(8, 2)),
                new Rectangle(3, 9, new Point(1, 5)),
                new Circle(4, new Point(9, 1)),
                new Circle(7, new Point(6, 3))
        };

        for (Shape shape : shapeObjects) {
            control.doAction(shape);
        }
    }
}
