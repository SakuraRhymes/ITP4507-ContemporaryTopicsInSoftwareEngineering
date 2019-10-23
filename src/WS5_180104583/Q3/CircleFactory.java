package WS5_180104583.Q3;

import java.io.IOException;

public class CircleFactory extends ShapeFactory {

    @Override
    public Shape createShape() throws IOException {
        String line = "";
        System.out.print("Enter x: ");
        line = br.readLine();
        int x = Integer.parseInt(line);
        System.out.print("Enter y: ");
        line = br.readLine();
        int y = Integer.parseInt(line);
        System.out.print("Enter radius: ");
        line = br.readLine();
        int r = Integer.parseInt(line);
        Shape shape = new Circle(x, y, r);
        return shape;
    }
}
