/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 *
 * @author Clarence Lau
 * @version 1.0
 */
package WS4_180104583.Q2;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Vector _shapes = new Vector();
        boolean cont = true;
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String[] factories = {"WS4_180104583.Q2.CircleFactory", "WS4_180104583.Q2.RectangleFactory"};

        try {
            while (cont) {
                System.out.println("Enter command: 0 = exit, 1 = draw all shapes, 2 = create circle, 3 = create rectangle");
                String line = br.readLine();
                int command = Integer.parseInt(line);
                if (command == 0)
                    cont = false;
                else if (command == 1) {
                    for (int i = 0; i < _shapes.size(); i++)
                        ((Shape) _shapes.elementAt(i)).draw();
                } else {
                    ShapeFactory shapeFactory = (ShapeFactory) Class.forName(factories[command - 2]).newInstance();
                    _shapes.add(shapeFactory.createShape());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}