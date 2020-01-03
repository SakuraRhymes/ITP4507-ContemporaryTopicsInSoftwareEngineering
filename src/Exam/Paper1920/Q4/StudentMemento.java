package Exam.Paper1920.Q4;

public class StudentMemento {
    String sid;
    String name;
    double gpa;

    private Student s;

    public StudentMemento(Student s) {
        sid = s.getSID();
        name = s.getName();
        gpa = s.getGPA();
        this.s = s;
    }

    public void restore() {
        s.setSID(sid);
        s.setName(name);
        s.setGPA(gpa);
    }
}
