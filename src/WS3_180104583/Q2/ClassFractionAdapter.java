package WS3_180104583.Q2;

public class ClassFractionAdapter extends LongFraction implements Fraction {
    /**
     * Create a LongFraction equal in value to num / den
     *
     * @param num
     * @param den
     */
    public ClassFractionAdapter(long num, long den) {
        super(num, den);
    }

    @Override
    public int getNumerator() {
        return (int) super.numerator();
    }

    @Override
    public int getDenominator() {
        return (int) super.denominator();
    }

    @Override
    public Fraction add(Fraction b) {
        LongFraction longFraction = super.plus(new LongFraction(b.getNumerator(), b.getDenominator()));
        return new ClassFractionAdapter(longFraction.numerator(), longFraction.denominator());
    }

    @Override
    public Fraction add(int b) {
        LongFraction longFraction = super.plus(b);
        return new ClassFractionAdapter(longFraction.numerator(), longFraction.denominator());
    }

    @Override
    public Fraction subtract(Fraction b) {
        LongFraction longFraction = super.minus(new LongFraction(b.getNumerator(), b.getDenominator()));
        return new ClassFractionAdapter(longFraction.numerator(), longFraction.denominator());
    }

    @Override
    public Fraction subtract(int b) {
        LongFraction longFraction = super.minus(b);
        return new ClassFractionAdapter(longFraction.numerator(), longFraction.denominator());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
