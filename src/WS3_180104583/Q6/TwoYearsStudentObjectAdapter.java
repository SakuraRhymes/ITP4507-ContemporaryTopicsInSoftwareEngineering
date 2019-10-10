package WS3_180104583.Q6;

public class TwoYearsStudentObjectAdapter extends TwoYearsStudent {
    private ThreeYearsStudent threeYearsStudent;

    public TwoYearsStudentObjectAdapter(ThreeYearsStudent threeYearsStudent) {
        super("", "", "", "", 0);
        this.threeYearsStudent = threeYearsStudent;
    }

    @Override
    public String getStudentName() {
        return threeYearsStudent.getStudentName();
    }

    @Override
    public String getStudentID() {
        return threeYearsStudent.getStudentID();
    }

    @Override
    public String getCode() {
        return threeYearsStudent.getCode();
    }

    @Override
    public String getName() {
        return threeYearsStudent.getName();
    }

    @Override
    public double getCgpa() {
        double CGPA;
        if (threeYearsStudent.getAverageMark() >= 75) {
            CGPA = 4.0;
        } else if (threeYearsStudent.getAverageMark() >= 65) {
            CGPA = 3.0;
        } else if (threeYearsStudent.getAverageMark() >= 55) {
            CGPA = 2.0;
        } else if (threeYearsStudent.getAverageMark() >= 40) {
            CGPA = 1.0;
        } else {
            CGPA = 0.0;
        }
        return CGPA;
    }

    @Override
    public String getStudentInfo() {

        String info = "";

        info += "Student Name: " + getStudentName() + "\n";
        info += "Student ID: " + getStudentID() + "\n";

        info += "Course Code: " + getCode() + "\n";
        info += "Course Name: " + getName() + "\n";

        info += "Student's GCPA: " + getCgpa() + "\n";

        return info;
    }
}
