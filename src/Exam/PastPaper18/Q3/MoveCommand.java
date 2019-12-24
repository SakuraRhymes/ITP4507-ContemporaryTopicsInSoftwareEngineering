package Exam.PastPaper18.Q3;

public class MoveCommand implements Command {
    private Robot robot;
    private Direction direction;
    private int step;

    public MoveCommand(Robot robot, Direction direction, int step) {
        this.robot = robot;
        this.direction = direction;
        this.step = step;
    }

    @Override
    public void execute() {
        if (Direction.LEFT == direction) {
            robot.setX(robot.getX() - step);
        } else if (Direction.RIGHT == direction) {
            robot.setX(robot.getX() + step);
        }
    }

    @Override
    public void undo() {
        if (Direction.LEFT == direction) {
            robot.setX(robot.getX() + step);
        } else if (Direction.RIGHT == direction) {
            robot.setX(robot.getX() - step);
        }
    }
}
