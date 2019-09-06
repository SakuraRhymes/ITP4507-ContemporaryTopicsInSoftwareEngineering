package Lab01.Q2;

public class Client {
    public void doAction(Server server) {
        System.out.println("Client: doAction");
        server.doService();
    }
}
