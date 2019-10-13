package WS3_180104583.Q3.SuperBank;

import WS3_180104583.Q3.BankOne.*;
import WS3_180104583.Q3.KWBank.*;

public class InternationalAccountObjectAdapter extends InternationalAccount {
    private Account account;
    private ForeignExchangeCalculator _calculator;

    public InternationalAccountObjectAdapter(Account account) {
        super();
        this.account = account;
    }

    @Override
    public void increase(double amount) {
        account.debit(amount);
    }

    public void decrease(double amount) {
        account.credit(amount);
    }

    public double showBalance() {
            return account.getBalance();
    }

    public double showBalanceInUSD() {
            return _calculator.HKD2USD(account.getBalance());
    }

    public String getAccountNumber() {
        return account.getAccountNumber();
    }

    public void setClient(Client clientObjectAdapter) {
        account.setCustomer(((ClientObjectAdapter) clientObjectAdapter).getCustomer());
    }

    public Client getClient() {
        Customer customer = account.getCustomer();
        Client client = new ClientObjectAdapter(customer);
        return client;
    }

    public void setCalculator(ForeignExchangeCalculator calculator) {
        _calculator = calculator;
    }

    public ForeignExchangeCalculator getCalculator() {
        return _calculator;
    }

    public String getCurrency() {
        return "HKD";
    }

    public Account getAccount() {
        return account;
    }
}
