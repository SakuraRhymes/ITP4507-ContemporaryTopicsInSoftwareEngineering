package WS3_180104583.Q3.BankOne;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author Dr. Clarence LAU
 * @version 1.0
 */

import java.util.*;

public class Customer {
    private String _name;
    private String _address;
    private Vector _accounts;

    public Customer(String name, String address) {
        _name = name;
        _address = address;
        _accounts = new Vector();
    }

    public String getName() {
        return _name;
    }

    public String getAddress() {
        return _address;
    }
    public void addAccount(Account account) {
        _accounts.add(account);
    }

    public void removeAccount(Account account) {
        _accounts.remove(account);
    }

    public Enumeration getAccounts() {
        return _accounts.elements();
    }
}