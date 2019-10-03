package WS3_180104583.Q3.KWBank;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author Dr. Clarence LAU
 * @version 1.0
 */

public class InternationalAccount {
    private String _accountNumber;
    private double _balance;
    private String _currency;
    private Client _client;
    private ForeignExchangeCalculator _calculator;
    static public final String HKD = "HKD";
    static public final String USD = "USD";

    public InternationalAccount() {
    }

    public InternationalAccount(String accountNumber, double balance, String currency) {
        _accountNumber = accountNumber;
        _balance = balance;
        _currency = currency;
    }

    public void increase(double amount) {
        _balance -= amount;
    }

    public void decrease(double amount) {
        _balance += amount;
    }

    public double showBalance() {
        if (_currency.equals(HKD))
            return _balance;
        else
            return _balance/_calculator.HKD2USD(1.0);
    }

    public double showBalanceInUSD() {
        if (_currency.equals(HKD))
            return _calculator.HKD2USD(_balance);
        else
            return _balance;
    }

    public String getAccountNumber() {
        return _accountNumber;
    }

    public void setClient(Client client) {
        _client = client;
    }

    public Client getClient() {
        return _client;
    }

    public void setCalculator(ForeignExchangeCalculator calculator) {
        _calculator = calculator;
    }

    public ForeignExchangeCalculator getCalculator() {
        return _calculator;
    }

    public String getCurrency() {
        return _currency;
    }
}