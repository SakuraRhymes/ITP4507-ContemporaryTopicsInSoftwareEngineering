package WS3_180104583.Q2;

public class Main {
    public static void main(String[] args) {
        Fraction a, b;

        a = new ObjectFractionAdapter(new LongFraction(1, 2));
        b = new ObjectFractionAdapter(new LongFraction(1, 4));

        printResult(a, b);

        System.out.println("---------------------");

        a = new ClassFractionAdapter(1, 2);
        b = new ClassFractionAdapter(1, 4);

        printResult(a, b);
    }

    private static void printResult(Fraction a, Fraction b) {
        System.out.println(a + "+" + b + "=" + a.add(b));
        System.out.println(a + "-" + b + "=" + a.subtract(b));
        System.out.println(a + "-" + 1 + "=" + a.subtract(1));
        System.out.println(a + "+" + 1 + "=" + a.add(1));
    }
}
