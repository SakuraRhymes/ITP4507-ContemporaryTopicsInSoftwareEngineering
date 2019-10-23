package WS5_180104583.Q2;

public class NextPrimeNumberTask implements Task {
    private int number = 2;

    @Override
    public void performTask() {
        while (true) {
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0)
                    isPrime = false;
            }

            if (isPrime) {
                System.out.println("Next prime number is : " + number);
                number++;
                break;
            }
            number++;
        }
    }
}
