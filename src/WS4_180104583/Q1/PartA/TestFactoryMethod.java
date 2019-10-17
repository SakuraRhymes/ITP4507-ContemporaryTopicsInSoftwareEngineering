package WS4_180104583.Q1.PartA;

public class TestFactoryMethod {
    public static void main(String[] args) {
        String[] creators = {"WS4_180104583.Q1.PartA.ConcreteCreatorA", "WS4_180104583.Q1.PartA.ConcreteCreatorB"};
        try {
            int choice = Integer.parseInt(args[0]);
            Creator c = (Creator) Class.forName(creators[choice]).newInstance();
            c.anOperation();
        } catch (Exception e) {
            System.out.println("Problem Encountered");
        }
    }
}

