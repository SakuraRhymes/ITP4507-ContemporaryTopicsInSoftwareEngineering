package WS2_180104583.Q2;

public class WashingMachine extends Appliance {

    public WashingMachine(double price) {
        super("WashingMachine", price);
    }

    @Override
    public double getExtendedWarrantyPrice() {
        return 70.0 + 0.15 * this.price;
    }
}
