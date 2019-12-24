package Exam.PastPaper18.Q4;

public abstract class Course {
    String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public abstract double getPayment(int payPeriod);
}
