package Exam.PastPaper18.Q2;

public class MemAdapterTester {
    public static void main(String[] args) {
        Member member = new Member(123, "TANG", "Siu May");
        MemAP memAP = new MemAP(member);
        Client client = new Client("c01", "Tai Man, CHAN");

        PrintClientList.displayClientList(new Client[]{client, memAP});
    }
}
