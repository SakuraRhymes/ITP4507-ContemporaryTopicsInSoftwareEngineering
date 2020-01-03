package Exam.Paper1920.Q2;

class PlayGame {
    public static void makeDamage(Weapon w) {
        System.out.println("Your weapon: " + w.getName());
        w.makeDamage();
    }
}