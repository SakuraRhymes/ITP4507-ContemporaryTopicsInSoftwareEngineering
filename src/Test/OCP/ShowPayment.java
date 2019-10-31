package Test.OCP;

public class ShowPayment {
    public static void printPayment(Course c, int payPeriod) {
        System.out.println("Course Name: " + c.getCourseName());
        System.out.println(c.getPaymentInfo(payPeriod));
    }
}