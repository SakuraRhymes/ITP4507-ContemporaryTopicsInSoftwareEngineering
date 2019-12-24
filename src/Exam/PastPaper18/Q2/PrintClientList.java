package Exam.PastPaper18.Q2;

public class PrintClientList {
    public static void displayClientList(Client[] clients) {
        String clientList = "\nThe Client List\n"
                + "===================\n"
                + "ID \t Name\n"
                + "===================\n";
        for (Client c : clients) {
            clientList += "\n" + c.getClientId() + " | " + c.getClientName();
        }
        System.out.println(clientList);
    }
}
