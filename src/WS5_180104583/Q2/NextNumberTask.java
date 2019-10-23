package WS5_180104583.Q2;

public class NextNumberTask implements Task {
    private int number = 1;

    @Override
    public void performTask() {
        System.out.println("Next number is : " + number++);
    }
}
