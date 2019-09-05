package Lab01.Q1;

public class Lab01Q1 {
    public static void main(String[] args) {
        Shape[] shapeObjects = {
                new Rectangle(10, 5, new Point(3, 7)),
                new Circle(6, new Point(8, 2)),
                new Rectangle(3, 9, new Point(1, 5)),
                new Circle(4, new Point(9, 1)),
                new Circle(7, new Point(6, 3))
        };

        for (Shape shape : shapeObjects) {
            System.out.println(shape.toString());
        }
    }
}
