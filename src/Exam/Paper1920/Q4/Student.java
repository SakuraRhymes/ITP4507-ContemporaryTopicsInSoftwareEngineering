package Exam.Paper1920.Q4;

public class Student {
    private String _sid; //student ID
    private String _name; //student name
    private double _gpa; //student gpa

    public Student(String sid, String name, double gpa) {
        _sid = sid;
        _name = name;
        _gpa = gpa;
    }

    public void setSID(String sid) {
        _sid = sid;
    }

    public void setName(String name) {
        _name = name;
    }

    public void setGPA(double gpa) {
        _gpa = gpa;
    }

    public String toString() {
        return _name + "’s GPA is " + _gpa;
    }

    public String getSID() {
        return _sid;
    }

    public String getName() {
        return _name;
    }

    public double getGPA() {
        return _gpa;
    }
}
