package WS3_180104583.Q1;

import java.awt.*;

public class CircleObjectAdapter implements NewCircle {
    private OldCircle oldCircle;

    public CircleObjectAdapter(OldCircle oldCircle) {
        this.oldCircle = oldCircle;
    }

    @Override
    public double getRadius() {
        return Math.sqrt(oldCircle.getCoeff()[2]);
    }

    @Override
    public Point getCenter() {
        return new Point((int) oldCircle.getCoeff()[0], (int) oldCircle.getCoeff()[1]);
    }
}
