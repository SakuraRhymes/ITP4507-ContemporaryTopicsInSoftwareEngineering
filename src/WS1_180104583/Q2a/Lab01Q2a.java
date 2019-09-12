package WS1_180104583.Q2a;

public class Lab01Q2a {
    public static void main(String[] args) {
        Client client = new Client();
        client.doAction(new Server());
        client.doAction(new Server2());
    }
}
