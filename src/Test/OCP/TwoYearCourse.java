package Test.OCP;

public class TwoYearCourse extends Course {
    double monthlyFee; // for TWO_YEAR only

    public TwoYearCourse(String courseName, double monthlyFee) {
        super(courseName);
        this.monthlyFee = monthlyFee;
    }

    @Override
    public double getPayment(int payPeriod) {
        if (payPeriod >= 3) {
            return monthlyFee * payPeriod * 0.7;
        } else {
            return monthlyFee * payPeriod;
        }
    }

    @Override
    public String getPaymentInfo(int payPeriod) {
        return String.format("Total payment for %d month(s): %.1f", payPeriod, getPayment(payPeriod));
    }
}
