package Test.OCP;

public abstract class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public abstract double getPayment(int payPeriod);

    public abstract String getPaymentInfo(int payPeriod);
}
