package Lab01.Q1;

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
