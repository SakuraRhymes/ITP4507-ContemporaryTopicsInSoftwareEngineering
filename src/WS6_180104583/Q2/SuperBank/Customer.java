package WS6_180104583.Q2.SuperBank;

import java.util.Vector;

public class Customer {
    Vector<Account> accounts;
    String name, address;

    public Customer(String name, String address) {
        accounts = new Vector<>();
        this.name = name;
        this.address = address;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public Account getAccount(int index) {
        return accounts.get(index);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showInfo() {
        System.out.printf("Customer: %s at address: %s\n", name, address);
        int index = 0;
        for (Account account : accounts) {
            System.out.printf("index: %d - Account Number: %s has balance %.1f\n", index++, account.accountNumber, account.balance);
        }
    }
}
