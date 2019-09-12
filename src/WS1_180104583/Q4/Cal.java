package WS1_180104583.Q4;

public class Cal {
    Debug debug;

    public Cal() {
        debug = new DebugToTextFile();
    }

    public void compute() {
        int x = 2, y = 3;
        String s = "hello";

        debug.log("Cal: compute()");
        int n = method1(x, y);
        int m = method2(s);
        debug.log("method1(" + x + "," + y + ")" + "=" + n);
        debug.log("method2(" + s + ")" + "=" + m);
    }

    int method1(int x, int y) {
        debug.log("Cal: method1(" + x + "," + y + ")");
        return x + method3(y);
    }

    int method3(int y) {
        debug.log("Cal: method3(" + y + ")");
        return 2 * y;
    }

    int method2(String s) {
        debug.log("Cal: method2(" + s + ")");
        return s.length() - 2;
    }
}
