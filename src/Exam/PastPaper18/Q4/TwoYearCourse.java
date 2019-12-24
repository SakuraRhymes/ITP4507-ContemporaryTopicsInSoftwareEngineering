package Exam.PastPaper18.Q4;

public class TwoYearCourse extends Course {
    private double monthlyFee;

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
}
