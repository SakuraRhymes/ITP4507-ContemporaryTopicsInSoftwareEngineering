package WS6_180104583.Q2;

import WS6_180104583.Q2.SuperBank.*;

public class Main {
    public static void main(String args[]) {
        // Peter has two accounts
        Customer peter = new Customer("Peter", "Wanchai");
        Account a1 = new Account("INT001", 100);
        Account a2 = new Account("INT002", 200);
        peter.addAccount(a1);
        peter.addAccount(a2);

        // Prepare a Caretaker for  the undo operation
        Caretaker ct = new Caretaker();

        // print out
        peter.showInfo();

        // Do some transaction
        ct.saveAccount(peter.getAccount(0)); //backup account 0
        peter.getAccount(0).increase(50);
        ct.saveAccount(peter.getAccount(1)); //backup account 1
        peter.getAccount(1).decrease(20);
        peter.showInfo();

        ct.saveCustomer(peter); //backup customer
        peter.setAddress("Wong Tai Sin");
        peter.showInfo();

        //backup customer accounts
        ct.saveCustomer(peter);
        peter.removeAccount(peter.getAccount(1));
        peter.showInfo();

        // undo now
        ct.undo();
        peter.showInfo();

        ct.undo();
        peter.showInfo();

        ct.undo();
        peter.showInfo();

        ct.undo();
        peter.showInfo();

        // redo now
        ct.redo();
        peter.showInfo();

        ct.redo();
        peter.showInfo();

        ct.redo();
        peter.showInfo();

        ct.redo();
        peter.showInfo();

    }

}
