package WS4_180104583.Q2;

import java.io.IOException;

public class CircleFactory extends ShapeFactory {

    @Override
    public Shape createShape() throws IOException {
        String line = "";
        System.out.println("Enter radius:");
        line = br.readLine();
        int r = Integer.parseInt(line);
        Shape shape = new Circle(0, 0, r);
        return shape;
    }
}
