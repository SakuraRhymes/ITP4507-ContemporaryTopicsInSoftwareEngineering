package WS2_180104583.Q1;

import java.util.Calendar;
import java.text.DecimalFormat;

public class Clock extends Thread {
    private DecimalFormat tflz, tf;
    private DisplayUI displayUI;

    public Clock(String displayUIName) {
        try {
            displayUIName = "WS2_180104583.Q1." + displayUIName;
            displayUI = (DisplayUI) Class.forName(displayUIName).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        tf = new DecimalFormat("#0");
        tflz = new DecimalFormat("00");
    }

    public void run() {
        try {
            while (true) {
                Calendar calendar = Calendar.getInstance();
                StringBuffer buf = new StringBuffer();
                buf.append(tf.format(calendar.get(Calendar.HOUR)));
                buf.append(':');
                buf.append(tflz.format(calendar.get(Calendar.MINUTE)));
                buf.append(':');
                buf.append(tflz.format(calendar.get(Calendar.SECOND)));
                // send the time string to be display
                displayUI.displayTime(buf.toString());
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static public void main(String[] arg) {
        Clock clock = new Clock(arg[0]);
        clock.run();
    }
}

