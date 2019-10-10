package WS3_180104583.Q6;

public class ShowResult {
    public static void printResult(TwoYearsStudent s) {
        System.out.println("Student Name: " + s.getStudentName());
        System.out.println("Student ID: " + s.getStudentID());
        System.out.println("Programme Code: " + s.getCode());
        System.out.println("Programme Name: " + s.getName());
        System.out.println("Student's GCPA: " + s.getCgpa());
    }
}
