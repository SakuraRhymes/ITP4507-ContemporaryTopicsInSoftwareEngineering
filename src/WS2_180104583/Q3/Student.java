package WS2_180104583.Q3;

public abstract class Student {
    protected String studentType;
    protected String studentName;
    protected String studentID;
    protected String code;             // Course or Programme Code
    protected String name;           // Course or Programme Name

    public Student(String studentType, String studentName, String studentID, String code, String name) {
        this.studentType = studentType;
        this.studentName = studentName;
        this.studentID = studentID;
        this.code = code;
        this.name = name;
    }

    public String getStudentType() {
        return studentType;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getStudentInfo() {
        String info = "";

        info += "Student Name: " + getStudentName() + "\n";
        info += "Student ID: " + getStudentID() + "\n";

        info += "Course Code: " + getCode() + "\n";
        info += "Course Name: " + getName() + "\n";

        return info;
    }
}

