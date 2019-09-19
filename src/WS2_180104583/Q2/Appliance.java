package WS2_180104583.Q2;

public abstract class Appliance {
    protected double price;
    protected String type;

    public Appliance(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public abstract double getExtendedWarrantyPrice();
}
