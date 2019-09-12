package WS1_180104583.Q1;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius, Point topLeft) {
        super("Circle", topLeft);
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return super.toString() + String.format(", Radius = %s, Area = %.2f", radius, getArea());
    }
}
