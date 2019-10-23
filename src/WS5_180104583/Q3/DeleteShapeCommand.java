package WS5_180104583.Q3;

import java.util.Scanner;
import java.util.Vector;

public class DeleteShapeCommand implements Command {
    private Vector<Shape> shapes;
    private Shape removedShape;
    private int removedShapeIndex;

    public DeleteShapeCommand(Vector<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index of the shape: ");
        removedShapeIndex = sc.nextInt();
        removedShape = shapes.remove(removedShapeIndex);
    }

    @Override
    public void undo() {
        shapes.add(removedShapeIndex, removedShape);
    }
}
