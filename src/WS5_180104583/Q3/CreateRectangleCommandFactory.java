package WS5_180104583.Q3;

import java.util.Vector;

public class CreateRectangleCommandFactory extends AbstractCommandFactory {
    private Vector<Shape> shapes;

    public CreateRectangleCommandFactory(Vector<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public Command createCommand() {
        return new CreateRectangleCommand(shapes);
    }
}
