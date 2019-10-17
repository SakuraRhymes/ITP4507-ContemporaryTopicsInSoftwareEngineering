package WS4_180104583.Q2;

import java.io.IOException;

public class RectangleFactory extends ShapeFactory {

    @Override
    public Shape createShape() throws IOException {
        String line = "";
        System.out.println("Enter width:");
        line = br.readLine();
        int width = Integer.parseInt(line);
        System.out.println("Enter height:");
        line = br.readLine();
        int height = Integer.parseInt(line);
        Shape shape = new Rectangle(0, 0, width, height);
        return shape;
    }
}
