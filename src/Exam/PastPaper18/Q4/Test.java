package Exam.PastPaper18.Q4;

public class Test {
    public static void main(String[] args) {
        Course twoYearCourse = new TwoYearCourse("2-Year Course", 700);
        Course shortCourse = new ShortCourse("Short Course", 20, 50);

        ShowPayment.printPayment(twoYearCourse, 2);
        ShowPayment.printPayment(twoYearCourse, 5);
        System.out.println();
        ShowPayment.printPayment(shortCourse, 10);
        ShowPayment.printPayment(shortCourse, 50);
    }
}
