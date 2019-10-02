package WS3_180104583.Q2;

public class ObjectFractionAdapter implements Fraction {
    private LongFraction longFraction;

    public ObjectFractionAdapter(LongFraction longFraction) {
        this.longFraction = longFraction;
    }

    @Override
    public int getNumerator() {
        return (int) longFraction.numerator();
    }

    @Override
    public int getDenominator() {
        return (int) longFraction.denominator();
    }

    @Override
    public Fraction add(Fraction b) {
        return new ObjectFractionAdapter(longFraction.plus(new LongFraction(b.getNumerator(), b.getDenominator())));
    }

    @Override
    public Fraction add(int b) {
        return new ObjectFractionAdapter(longFraction.plus(b));
    }

    @Override
    public Fraction subtract(Fraction b) {
        return new ObjectFractionAdapter(longFraction.minus(new LongFraction(b.getNumerator(), b.getDenominator())));
    }

    @Override
    public Fraction subtract(int b) {
        return new ObjectFractionAdapter(longFraction.minus(b));
    }

    @Override
    public String toString() {
        return longFraction.toString();
    }
}
