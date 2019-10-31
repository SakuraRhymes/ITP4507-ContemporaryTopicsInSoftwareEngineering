package Test.OCP;

public class Main {
    public static void main(String[] args) {
        Course twoYearCourse = new TwoYearCourse("TwoYearCourse", 200);
        Course shortCourse = new ShortCourse("ShortCourse", 50, 10);

        ShowPayment.printPayment(twoYearCourse, 10);
        ShowPayment.printPayment(shortCourse, 5);
    }
}
