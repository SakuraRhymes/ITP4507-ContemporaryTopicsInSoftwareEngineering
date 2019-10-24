package WS6_180104583.Q2.SuperBank;

public class Account {
    Customer customer;
    String accountNumber;
    double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void increase(double amount) {
        System.out.printf("Account no: %s increase amount: %.1f\n", accountNumber, amount);
        balance += amount;
    }

    public void decrease(double amount) {
        System.out.printf("Account no: %s decrease amount: %.1f\n", accountNumber, amount);
        balance -= amount;
    }
}
