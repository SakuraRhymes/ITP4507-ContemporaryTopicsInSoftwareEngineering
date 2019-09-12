package WS1_180104583.Q2b;

public abstract class Shape {
    private String name;
    private Point topLeft;

    public Shape(String name, Point topLeft) {
        this.name = name;
        this.topLeft = topLeft;
    }

    public abstract double getArea();

    public String toString() {
        return String.format("%s : topLeft %s", name, topLeft.toString());
    }
}
