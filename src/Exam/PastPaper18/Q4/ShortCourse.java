package Exam.PastPaper18.Q4;

public class ShortCourse extends Course {
    private double hourlyRate;
    private int hours;

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
}
