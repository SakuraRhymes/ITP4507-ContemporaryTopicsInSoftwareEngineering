package Test.Adapter;

public class MemAdapterTester {
    public static void main(String[] args) {
        Member member = new Member("123", "TANG", "Siu May");
        Client client = new Client("c01", "Tai Man, CHAN");

        MemAP memAP = new MemAP(member);

        Client[] clients = {client, memAP};

        PrintClientList.displayClientList(clients);
    }
}
