package Exam.PastPaper18.Q3;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Command command;
        Stack<Command> commandStack = new Stack<>();

        System.out.println("Create Robot with 0,0 Coordinate");
        Robot robot = new Robot(0, 0);
        System.out.println(robot);

        System.out.println("\nMove Robot 3 steps to the LEFT");
        command = new MoveCommand(robot, Direction.LEFT, 3);
        command.execute();
        commandStack.add(command);
        System.out.println(robot);

        System.out.println("\nMove Robot 5 steps to the RIGHT");
        command = new MoveCommand(robot, Direction.RIGHT, 5);
        command.execute();
        commandStack.add(command);
        System.out.println(robot);

        System.out.println("\nUndo - Move Robot 5 steps to the RIGHT");
        commandStack.pop().undo();
        System.out.println(robot);

        System.out.println("\nUndo - Move Robot 3 steps to the LEFT");
        commandStack.pop().undo();
        System.out.println(robot);
    }
}
