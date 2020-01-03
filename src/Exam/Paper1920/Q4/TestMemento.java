package Exam.Paper1920.Q4;

public class TestMemento {
    public static void main(String[] args) {
        CareTaker ct = new CareTaker();
        Student std = new Student("1900123", "Roger Chan", 3.5);
        ct.saveStudent(std);
        std.setName("Robert Lam");
        ct.saveStudent(std);
        std.setGPA(3.7);
        ct.undo();
        System.out.println(std);
    }
}
