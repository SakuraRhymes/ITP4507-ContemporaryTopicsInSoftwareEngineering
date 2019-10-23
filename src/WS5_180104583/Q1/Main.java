package WS5_180104583.Q1;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        boolean keepGoing = true;
        Scanner sc = new Scanner(System.in);
        Stack<Command> undoList = new Stack<>();

        while (keepGoing) {
            System.out.println("Enter command: 0 =exit, 1 = undo, 2 = Command1, 3 = Command2");
            int command = sc.nextInt();
            switch (command) {
                case 0:
                    keepGoing = false;
                    break;
                case 1:
                    Command c = undoList.pop();
                    c.undo();
                    break;
                case 2:
                    AbstractCommandFactory command1Factory = new Command1Factory();
                    Command c1 = command1Factory.createCommand();
                    c1.execute();
                    undoList.push(c1);
                    break;
                case 3:
                    AbstractCommandFactory command2Factory = new Command2Factory();
                    Command c2 = command2Factory.createCommand();
                    c2.execute();
                    undoList.push(c2);
                    break;
            }
        }
    }
}
