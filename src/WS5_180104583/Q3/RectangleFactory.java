package WS5_180104583.Q3;

import java.io.IOException;

public class RectangleFactory extends ShapeFactory {

    @Override
    public Shape createShape() throws IOException {
        String line = "";
        System.out.print("Enter x: ");
        line = br.readLine();
        int x = Integer.parseInt(line);
        System.out.print("Enter y: ");
        line = br.readLine();
        int y = Integer.parseInt(line);
        System.out.print("Enter width: ");
        line = br.readLine();
        int width = Integer.parseInt(line);
        System.out.print("Enter height: ");
        line = br.readLine();
        int height = Integer.parseInt(line);
        Shape shape = new Rectangle(x, y, width, height);
        return shape;
    }
}
