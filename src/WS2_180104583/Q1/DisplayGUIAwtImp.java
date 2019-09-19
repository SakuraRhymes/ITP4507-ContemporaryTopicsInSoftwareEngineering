package WS2_180104583.Q1;

import java.awt.Frame;
import java.awt.Label;
import java.awt.BorderLayout;

public class DisplayGUIAwtImp implements DisplayUI {
    private Frame frame;
    private Label label;

    public DisplayGUIAwtImp() {
        frame = new Frame();
        label = new Label();
        frame.add(label, BorderLayout.CENTER);
        frame.setSize(50, 50);
        frame.show();
    }

    @Override
    public void displayTime(String timeString) {
        label.setText(timeString);
        label.repaint();
    }
}
