package Exam.PastPaper18.Q4;

public class ShowPayment {
    public static void printPayment(Course c, int payPeriod) {
        System.out.println("Course Name: ");
        System.out.println(c.getCourseName());
        System.out.print("Total payment for " + payPeriod);

        if (c instanceof TwoYearCourse) {
            System.out.print(" month(s): ");
        } else if (c instanceof ShortCourse) {
            System.out.print(" hour(s): ");
        }

        System.out.println(c.getPayment(payPeriod));
    }
}
