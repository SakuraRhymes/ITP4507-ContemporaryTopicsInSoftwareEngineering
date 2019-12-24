package Exam.PastPaper18.Q2;

public class Client {
    String clientId;
    String clientName;

    public Client() {
    }

    public Client(String id, String name) {
        clientId = id;
        this.clientName = name;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientName() {
        return clientName;
    }
}
