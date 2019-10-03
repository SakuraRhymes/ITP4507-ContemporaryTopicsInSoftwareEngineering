package WS3_180104583.Q3.BankOne;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 *
 * @author Dr. Clarence LAU
 * @version 1.0
 */

public class Account {
    private String _accountNumber;
    private double _balance;
    private Customer _customer;

    public Account(String accountNumber, double balance) {
        _accountNumber = accountNumber;
        _balance = balance;
    }

    public void debit(double amount) {
        _balance -= amount;
    }

    public void credit(double amount) {
        _balance += amount;
    }

    public double getBalance() {
        return _balance;
    }

    public String getAccountNumber() {
        return _accountNumber;
    }

    public void setCustomer(Customer customer) {
        _customer = customer;
    }

    Customer getCustomer() {
        return _customer;
    }
}