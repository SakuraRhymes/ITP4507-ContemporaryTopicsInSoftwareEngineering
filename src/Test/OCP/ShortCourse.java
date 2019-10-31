package Test.OCP;

public class ShortCourse extends Course {
    double hourlyRate; // for SHORT_COURSE only
    int hours; // total hours for SHORT_COURSE

    public ShortCourse(String courseName, double hourlyRate, int hours) {
        super(courseName);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public double getPayment(int payPeriod) {
        if (payPeriod == hours) {
            return hourlyRate * payPeriod * 0.85;
        } else {
            return hourlyRate * payPeriod;
        }
    }

    @Override
    public String getPaymentInfo(int payPeriod) {
        return String.format("Total payment for %d hour(s): %.1f", payPeriod, getPayment(payPeriod));
    }
}
