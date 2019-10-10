package WS3_180104583.Q6;

public class Lab03Q6 {
    public static void main(String[] args) {
        TwoYearsStudent twoYearsStudent = new TwoYearsStudent("Jacky", "180406371", "IT114105", "HD in Software Engineering", 4);
        TwoYearsStudent twoYearsStudentObjectAdapter = new TwoYearsStudentObjectAdapter(new ThreeYearsStudent("Tony", "190108125", "41303", "HD in Software Engineering", 87));

        ShowResult.printResult(twoYearsStudent);
        System.out.println();
        ShowResult.printResult(twoYearsStudentObjectAdapter);
    }
}
