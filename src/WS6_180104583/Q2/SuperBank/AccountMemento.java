package WS6_180104583.Q2.SuperBank;

public class AccountMemento implements Memento {
    Account account;
    private double balance;

    public AccountMemento(Account account) {
        this.account = account;
        this.balance = account.balance;
    }

    @Override
    public void restore() {
        System.out.printf(" - restore account content:\n");
        System.out.printf("restore account no: %s balance %.1f\n", account.accountNumber, balance);
        account.balance = balance;
    }
}
