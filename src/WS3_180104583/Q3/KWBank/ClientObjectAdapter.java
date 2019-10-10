package WS3_180104583.Q3.KWBank;

import WS3_180104583.Q3.BankOne.*;

import java.util.Enumeration;
import java.util.Vector;

public class ClientObjectAdapter extends Client {
    private Customer customer;

    public ClientObjectAdapter(Customer customer) {
        super();
        this.customer = customer;
    }

    @Override
    public String getName() {
        return customer.getName();
    }

    @Override
    public String getAddress() {
        return customer.getAddress();
    }

    @Override
    public void addInternationalAccount(InternationalAccount internationalAccountObjectAdapter) {
        Account account = new Account(internationalAccountObjectAdapter.getAccountNumber(), internationalAccountObjectAdapter.showBalance());
        customer.addAccount(account);
    }

    @Override
    public void removeInternationalAccount(InternationalAccount internationalAccountObjectAdapter) {
        customer.removeAccount(((InternationalAccountObjectAdapter) internationalAccountObjectAdapter).getAccount());
    }

    @Override
    public Enumeration getInternationalAccounts() {
        Vector internalAccounts = new Vector();
        Enumeration accounts = customer.getAccounts();
        while (accounts.hasMoreElements()) {
            internalAccounts.add(new InternationalAccountObjectAdapter((Account) accounts.nextElement()));
        }
        return internalAccounts.elements();
    }

    public Customer getCustomer() {
        return customer;
    }
}
