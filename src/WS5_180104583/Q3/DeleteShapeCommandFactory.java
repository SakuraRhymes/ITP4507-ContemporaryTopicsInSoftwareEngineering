package WS5_180104583.Q3;

import java.util.Vector;

public class DeleteShapeCommandFactory extends AbstractCommandFactory {
    private Vector<Shape> shapes;

    public DeleteShapeCommandFactory(Vector<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public Command createCommand() {
        return new DeleteShapeCommand(shapes);
    }
}
