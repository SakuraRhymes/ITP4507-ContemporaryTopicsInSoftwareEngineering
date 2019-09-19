package WS2_180104583.Q1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class DisplayGUISwingImp implements DisplayUI {
    private JFrame frame;
    private JLabel label;

    public DisplayGUISwingImp() {
        frame = new JFrame();
        label = new JLabel();
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.setSize(50, 50);
        frame.show();
    }

    @Override
    public void displayTime(String timeString) {
        label.setText(timeString);
    }
}
