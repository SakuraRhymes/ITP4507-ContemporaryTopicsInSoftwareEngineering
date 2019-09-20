package WS2_180104583.Q3;

public class Lab02Q3 {
    public static void main(String[] args) {
        Student twoYearsStudent = new TwoYearsStudent("Jacky", "180406371", "IT114105", "HD in Software Engineering", 4);
        Student threeYearsStudent = new ThreeYearsStudent("Tony", "190108125", "41303", "HD in Software Engineering", 87);

        ShowResult.printResult(twoYearsStudent);
        ShowResult.printResult(threeYearsStudent);
    }
}
