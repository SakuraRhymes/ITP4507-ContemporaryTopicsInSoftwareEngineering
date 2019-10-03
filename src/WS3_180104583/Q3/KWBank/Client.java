package WS3_180104583.Q3.KWBank;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author Dr. Clarence LAU
 * @version 1.0
 */

import java.util.*;

public class Client {
    private String _name;
    private String _address;
    private Vector _internalAccounts;

    public Client() {
    }

    public Client(String name, String address) {
        _name = name;
        _address = address;
        _internalAccounts = new Vector();
    }

    public String getName() {
        return _name;
    }

    public String getAddress() {
        return _address;
    }
    public void addInternationalAccount(InternationalAccount account) {
        _internalAccounts.add(account);
    }

    public void removeInternationalAccount(InternationalAccount account) {
        _internalAccounts.remove(account);
    }

    public Enumeration getInternationalAccounts() {
        return _internalAccounts.elements();
    }
}
