package WS3_180104583.Q3.KWBank;

import WS3_180104583.Q3.BankOne.*;

public class InternationalAccountObjectAdapter extends InternationalAccount {
    private Account account;
    private String currency;
    private Client clientObjectAdapter;
    private ForeignExchangeCalculator foreignExchangeCalculator;
    static public final String HKD = "HKD";
    static public final String USD = "USD";

    public InternationalAccountObjectAdapter(Account account, String currency) {
        this.account = account;
        this.currency = currency;
        foreignExchangeCalculator = new ForeignExchangeCalculator();
    }

    @Override
    public void increase(double amount) {
        account.credit(amount);
    }

    @Override
    public void decrease(double amount) {
        account.debit(amount);
    }

    @Override
    public double showBalance() {
        if (currency.equals(HKD))
            return account.getBalance();
        else
            return account.getBalance() / foreignExchangeCalculator.HKD2USD(1.0);
    }

    @Override
    public double showBalanceInUSD() {
        if (currency.equals(HKD))
            return foreignExchangeCalculator.HKD2USD(account.getBalance());
        else
            return account.getBalance();
    }

    @Override
    public String getAccountNumber() {
        return account.getAccountNumber();
    }

    @Override
    public void setClient(Client client) {
        clientObjectAdapter = client;
    }

    @Override
    public Client getClient() {
        return clientObjectAdapter;
    }

    @Override
    public void setCalculator(ForeignExchangeCalculator calculator) {
        foreignExchangeCalculator = calculator;
    }

    @Override
    public ForeignExchangeCalculator getCalculator() {
        return foreignExchangeCalculator;
    }
}
