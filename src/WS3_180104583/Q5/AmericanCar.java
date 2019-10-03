package WS3_180104583.Q5;

public class AmericanCar {
    public String name;
    public double speedInMile;    // in miles per hour

    public AmericanCar(String name, double speedInMile) {
        this.name = name;
        this.speedInMile = speedInMile;
    }

    public String getName() {
        return name;
    }

    public double getSpeedInMile() {
        return speedInMile;
    }

    public double speedDiff(AmericanCar car) {
        return getSpeedInMile() - car.getSpeedInMile();
    }
}

