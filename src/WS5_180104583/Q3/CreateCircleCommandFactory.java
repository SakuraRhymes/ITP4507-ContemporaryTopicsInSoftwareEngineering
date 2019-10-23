package WS5_180104583.Q3;

import java.util.Vector;

public class CreateCircleCommandFactory extends AbstractCommandFactory {
    private Vector<Shape> shapes;

    public CreateCircleCommandFactory(Vector<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public Command createCommand() {
        return new CreateCircleCommand(shapes);
    }
}
