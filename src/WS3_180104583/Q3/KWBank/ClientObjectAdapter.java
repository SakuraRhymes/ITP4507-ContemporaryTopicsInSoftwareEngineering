package WS3_180104583.Q3.KWBank;

import WS3_180104583.Q3.BankOne.*;

import java.util.*;

public class ClientObjectAdapter extends Client {
    private Customer customer;
    private Vector internationalAccountAdapters;

    public ClientObjectAdapter(Customer customer) {
        super("", "");
        this.customer = customer;
        internationalAccountAdapters = new Vector();
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
    public void addInternationalAccount(InternationalAccount internationalAccount) {
        internationalAccountAdapters.add(internationalAccount);
    }

    @Override
    public void removeInternationalAccount(InternationalAccount internationalAccount) {
        internationalAccountAdapters.remove(internationalAccount);
    }

    @Override
    public Enumeration getInternationalAccounts() {
        return internationalAccountAdapters.elements();
    }
}
