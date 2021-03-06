package WS4_180104583.Q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class ShapeFactory {
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);

    public abstract Shape createShape() throws IOException;
}
