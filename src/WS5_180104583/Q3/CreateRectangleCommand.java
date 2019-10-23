package WS5_180104583.Q3;

import java.io.IOException;
import java.util.Vector;

public class CreateRectangleCommand implements Command {
    private Vector<Shape> shapes;
    private ShapeFactory rectangleFactory;
    private Shape createdShape;

    public CreateRectangleCommand(Vector<Shape> shapes) {
        this.shapes = shapes;
        rectangleFactory = new RectangleFactory();
    }

    @Override
    public void execute() {
        try {
            createdShape = rectangleFactory.createShape();
            shapes.add(createdShape);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void undo() {
        shapes.remove(createdShape);
    }
}
