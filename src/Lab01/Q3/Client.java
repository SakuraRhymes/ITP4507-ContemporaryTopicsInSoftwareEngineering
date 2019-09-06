package Lab01.Q3;

public class Client {
    public void doAction(ServerInterface server) {
        System.out.println("Client: doAction");
        server.doService();
    }
}
