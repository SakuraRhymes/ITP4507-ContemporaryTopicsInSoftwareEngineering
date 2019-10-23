package WS5_180104583.Q3;

import java.util.Vector;

public class DrawAllShapesCommandFactory extends AbstractCommandFactory {
    private Vector<Shape> shapes;

    public DrawAllShapesCommandFactory(Vector<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public Command createCommand() {
        return new DrawAllShapesCommand(shapes);
    }
}
