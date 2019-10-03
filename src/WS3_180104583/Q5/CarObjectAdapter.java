package WS3_180104583.Q5;

public class CarObjectAdapter extends Car {
    private AmericanCar americanCar;

    public CarObjectAdapter(AmericanCar americanCar) {
        this.americanCar = americanCar;
    }

    @Override
    public String getName() {
        return americanCar.getName();
    }

    @Override
    public double getMaxSpeed() {
        return mile2Kilometer(americanCar.getSpeedInMile());
    }

    @Override
    public double compare(Car car) {
        return this.getMaxSpeed() - car.getMaxSpeed();
    }

    private double mile2Kilometer(double mile) {
        return mile * 1.609;
    }
}
