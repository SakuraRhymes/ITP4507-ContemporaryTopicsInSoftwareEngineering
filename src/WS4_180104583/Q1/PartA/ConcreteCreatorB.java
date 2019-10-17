package WS4_180104583.Q1.PartA;

public class ConcreteCreatorB extends Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
