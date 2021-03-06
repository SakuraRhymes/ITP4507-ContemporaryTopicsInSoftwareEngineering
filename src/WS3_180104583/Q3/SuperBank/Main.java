package WS3_180104583.Q3.SuperBank;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 *
 * @author Dr. Clarence LAU
 * @version 1.0
 */

import WS3_180104583.Q3.BankOne.*;
import WS3_180104583.Q3.KWBank.*;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Client c1 = new ClientObjectAdapter(new Customer("Peter Chan", "20 Tsing Yi Road, Tsing Yi"));
        InternationalAccount a1 = new InternationalAccountObjectAdapter(new Account("12-123-22", 1000.0));
        InternationalAccount a2 = new InternationalAccountObjectAdapter(new Account("13-123-22", 2000.0));
        c1.addInternationalAccount(a1);
        c1.addInternationalAccount(a2);
        ForeignExchangeCalculator calculator = new ForeignExchangeCalculator();
        a1.setCalculator(calculator);
        a2.setCalculator(calculator);
        System.out.println("Customer " + c1.getName() + ", " + c1.getAddress());
        System.out.println("International Accounts");
        Enumeration accounts = c1.getInternationalAccounts();
        while (accounts.hasMoreElements()) {
            InternationalAccount a = (InternationalAccount) accounts.nextElement();
            System.out.println("  International Account " + a.getAccountNumber() + ", currency = " + a.getCurrency() + ", balance = HKD " +
                    a.showBalance());
        }
    }
}