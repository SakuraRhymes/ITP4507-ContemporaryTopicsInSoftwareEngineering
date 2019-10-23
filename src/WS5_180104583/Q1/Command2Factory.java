package WS5_180104583.Q1;

import java.util.Scanner;

public class Command2Factory extends AbstractCommandFactory {
    @Override
    public Command createCommand() {
        return new Command2(new Scanner(System.in));
    }
}
