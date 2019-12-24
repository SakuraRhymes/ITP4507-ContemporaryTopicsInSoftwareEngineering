package Exam.PastPaper18.Q3;

public class RobotController {
    private Robot robot;

    public RobotController(Robot robot) {
        this.robot = robot;
    }

    public void move(Direction direction, int step) {
        if (Direction.LEFT == direction) {
            robot.setX(robot.getX() - step);
        } else if (Direction.RIGHT == direction) {
            robot.setX(robot.getX() + step);
        }
    }

    public void reserve(Direction direction, int step) {
        if (Direction.LEFT == direction) {
            robot.setX(robot.getX() + step);
        } else if (Direction.RIGHT == direction) {
            robot.setX(robot.getX() - step);
        }
    }
}
