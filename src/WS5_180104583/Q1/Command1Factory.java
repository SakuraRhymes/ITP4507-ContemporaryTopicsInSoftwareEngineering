package WS5_180104583.Q1;

import java.util.Scanner;

public class Command1Factory extends AbstractCommandFactory {
    @Override
    public Command createCommand() {
        return new Command1(new Scanner(System.in));
    }
}
