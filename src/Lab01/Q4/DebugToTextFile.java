package Lab01.Q4;

import java.io.*;

public class DebugToTextFile implements Debug {

    private PrintWriter out;

    public DebugToTextFile() {
        try {
            FileWriter outputFile = new FileWriter("log.text");
            out = new PrintWriter(outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void log(String message) {
        out.println(message);
        out.flush();
    }
}
