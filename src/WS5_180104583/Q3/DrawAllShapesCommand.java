package WS5_180104583.Q3;

import java.util.Vector;

public class DrawAllShapesCommand implements Command {
    private Vector<Shape> shapes;

    public DrawAllShapesCommand(Vector<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public void execute() {
        for (int i = 0; i < shapes.size(); i++) {
            System.out.print("index: " + i + " - ");
            (shapes.elementAt(i)).draw();
        }
    }

    @Override
    public void undo() {

    }
}
