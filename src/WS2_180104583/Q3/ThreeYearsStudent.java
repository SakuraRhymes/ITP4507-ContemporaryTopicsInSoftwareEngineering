package WS2_180104583.Q3;

public class ThreeYearsStudent extends Student {
    private int averageMark;

    public ThreeYearsStudent(String studentName, String studentID, String code, String name, int averageMark) {
        super("ThreeYearsStudent", studentName, studentID, code, name);
        this.averageMark = averageMark;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public String getStudentInfo() {
        String info = super.getStudentInfo();

        info += "Student's Average Mark: " + getAverageMark() + "\n";

        return info;
    }
}
