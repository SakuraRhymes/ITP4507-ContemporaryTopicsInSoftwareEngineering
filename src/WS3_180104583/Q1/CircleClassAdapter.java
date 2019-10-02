package WS3_180104583.Q1;

import java.awt.*;

public class CircleClassAdapter extends OldCircleImpl implements NewCircle {
    public CircleClassAdapter(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double getRadius() {
        return Math.sqrt(super.getCoeff()[2]);
    }

    @Override
    public Point getCenter() {
        return new Point((int) super.getCoeff()[0], (int) super.getCoeff()[1]);
    }
}
