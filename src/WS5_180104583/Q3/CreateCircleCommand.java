package WS5_180104583.Q3;

import java.io.IOException;
import java.util.Vector;

public class CreateCircleCommand implements Command {
    private Vector<Shape> shapes;
    private ShapeFactory circleFactory;
    private Shape createdShape;

    public CreateCircleCommand(Vector<Shape> shapes) {
        this.shapes = shapes;
        circleFactory = new CircleFactory();
    }

    @Override
    public void execute() {
        try {
            createdShape = circleFactory.createShape();
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
