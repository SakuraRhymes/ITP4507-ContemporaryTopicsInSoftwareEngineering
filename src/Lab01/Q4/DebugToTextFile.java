package Lab01.Q4;

import java.io.*;

public class DebugToTextFile implements Debug {

    private PrintWriter out;

    public DebugToTextFile() {
        try {
            FileWriter outputFile = new FileWriter("log.txt");
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
