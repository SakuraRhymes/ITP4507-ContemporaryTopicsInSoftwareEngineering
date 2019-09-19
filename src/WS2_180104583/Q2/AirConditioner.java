package WS2_180104583.Q2;

public class AirConditioner extends Appliance {
    public AirConditioner(double price) {
        super("AirConditioner", price);
    }

    @Override
    public double getExtendedWarrantyPrice() {
        return Math.max(0.2 * price, 500.0);
    }
}
