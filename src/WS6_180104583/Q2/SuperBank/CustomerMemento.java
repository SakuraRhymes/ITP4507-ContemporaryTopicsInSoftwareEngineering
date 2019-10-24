package WS6_180104583.Q2.SuperBank;

import java.util.Vector;

public class CustomerMemento implements Memento {
    Customer customer;
    private Vector<Account> accounts;
    private String name, address;

    public CustomerMemento(Customer customer) {
        this.customer = customer;
        this.accounts = (Vector<Account>) customer.accounts.clone();
        this.name = customer.name;
        this.address = customer.address;
    }

    @Override
    public void restore() {
        System.out.printf(" - restore customer content:\n");
        customer.accounts = (Vector<Account>) accounts.clone();
        customer.name = name;
        customer.address = address;
    }
}
