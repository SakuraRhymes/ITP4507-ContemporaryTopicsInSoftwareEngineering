package WS3_180104583.Q5;

public class Lab03Q5 {
    public static void main(String[] args) {
        Car carA = new CarObjectAdapter(new AmericanCar("Car A", 100));
        Car carB = new Car("Car B", 160);

        System.out.println(TestCarSpeed.compare(carA, carB));
    }
}
