package WS4_180104583.Q1.PartB;

public class Client {
    AbstractFactory abstractFactory;
    AbstractProductA abstractProductA;
    AbstractProductB abstractProductB;

    public AbstractProductA createA(AbstractFactory abstractFactory) {
        return abstractFactory.createProductA();
    }

    public AbstractProductB createB(AbstractFactory abstractFactory) {
        return abstractFactory.createProductB();
    }
}
