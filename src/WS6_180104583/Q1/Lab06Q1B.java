package WS6_180104583.Q1;

import WS6_180104583.Q1.MyPackage.*;

import java.util.EmptyStackException;
import java.util.Scanner;

public class Lab06Q1B {
    public static void main(String[] args) {
        boolean cont = true;

        Scanner scanner = new Scanner(System.in);
        Caretaker caretaker = new Caretaker();
        MyClass myClass = new MyClass();

        System.out.println("Create a my class object with state 1");

        while (cont) {
            System.out.println("Enter command : 0 = exit, 1 = undo, 2 = redo, 3 = doAction");
            switch (scanner.nextInt()) {
                case 0:
                    cont = false;
                    break;
                case 1:
                    try {
                        caretaker.undo();
                        System.out.println("Perform undo.");
                        System.out.println("Current state: " + myClass.getState());
                    } catch (EmptyStackException e) {
                        System.out.println("Nothing to undo.");
                    }
                    break;
                case 2:
                    try {
                        caretaker.redo();
                        System.out.println("Perform redo.");
                        System.out.println("Current state: " + myClass.getState());
                    } catch (EmptyStackException e) {
                        System.out.println("Nothing to redo.");
                    }
                    break;
                case 3:
                    caretaker.saveMyClass(myClass);
                    myClass.doAction();
                    System.out.println("Current state: " + myClass.getState());
                    break;
            }
            System.out.println();
        }
    }
}
