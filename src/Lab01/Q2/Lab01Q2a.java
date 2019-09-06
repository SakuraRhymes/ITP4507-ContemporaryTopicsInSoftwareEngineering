package Lab01.Q2;

public class Lab01Q2a {
    public static void main(String[] args) {
        Client client = new Client();
        client.doAction(new Server());
        client.doAction(new Server2());
    }
}
