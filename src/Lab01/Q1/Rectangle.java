package Lab01.Q1;

public class Rectangle extends Shape {
    private int width, height;

    public Rectangle(int width, int height, Point topLeft) {
        super("Rectangle", topLeft);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public String toString() {
        return super.toString() + String.format(", Width = %s, Height = %s, Area = %.1f", width, height, getArea());
    }
}
