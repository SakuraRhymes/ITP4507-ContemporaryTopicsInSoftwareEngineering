package WS4_180104583.Q1.PartA;

public abstract class Creator {
    public abstract Product factoryMethod();

    public void anOperation() {
        Product product = factoryMethod();
        System.out.println("Product Created : " + product.getName());
    }
}
