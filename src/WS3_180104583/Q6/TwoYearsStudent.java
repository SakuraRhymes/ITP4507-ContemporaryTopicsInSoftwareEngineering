package WS3_180104583.Q6;

public class TwoYearsStudent extends Student {
    private double cgpa;

    public TwoYearsStudent(String studentName, String studentID, String code, String name, double cgpa) {
        super("TwoYearsStudent", studentName, studentID, code, name);
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String getStudentInfo() {
        String info = super.getStudentInfo();

        info += "Student's GCPA: " + getCgpa() + "\n";

        return info;
    }
}
