package WS2_180104583.Q1;

import java.awt.*;
import javax.swing.*;

class SwingExample {
    private JFrame frame;
    private JLabel label;

    public SwingExample() {
        frame = new JFrame();
        label = new JLabel();
        label.setText("12:00:30");
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.setSize(50, 50);
        frame.show();
    }

    public static void main(String args[]) {
        SwingExample sw = new SwingExample();
    }
}

