package WS1_180104583.Q2a;

public class Client {
    public void doAction(Server server) {
        System.out.println("Client: doAction");
        server.doService();
    }
}
