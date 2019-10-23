package WS5_180104583.Q3;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Stack<Command> commandHistory = new Stack<>();
        Vector<Shape> shapes = new Vector<>();
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        AbstractCommandFactory commandFactory;

        try {
            while (cont) {
                System.out.println();
                System.out.println();
                System.out.println("Enter command: 0 = exit, 1 = undo, 2 = draw all shapes, 3 = delete a shape, 4 = create circle, 5 = create rectangle");
                int command = sc.nextInt();
                if (command == 0) {
                    cont = false;
                } else if (command == 1) {
                    commandHistory.pop().undo();
                } else if (command == 2) {
                    commandFactory = new DrawAllShapesCommandFactory(shapes);
                    Command drawAllShapesCommand = commandFactory.createCommand();
                    drawAllShapesCommand.execute();
                } else if (command == 3) {
                    commandFactory = new DeleteShapeCommandFactory(shapes);
                    Command deleteShapeCommand = commandFactory.createCommand();
                    deleteShapeCommand.execute();
                    commandHistory.add(deleteShapeCommand);
                } else if (command == 4) {
                    commandFactory = new CreateCircleCommandFactory(shapes);
                    Command createCommand = commandFactory.createCommand();
                    createCommand.execute();
                    commandHistory.add(createCommand);
                } else if (command == 5) {
                    commandFactory = new CreateRectangleCommandFactory(shapes);
                    Command createCommand = commandFactory.createCommand();
                    createCommand.execute();
                    commandHistory.add(createCommand);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}