package Lab01.Q3;

public class Lab01Q3 {
    public static void main(String[] args) {
        Client client = new Client();
        client.doAction(new Server());
        client.doAction(new Server2());
    }
}
