package Exam.Paper1920.Q2;

public class Main {
    public static void main(String[] args) {
        Weapon gs = new GreatSword("sword", 10);
        Weapon gun = new Gun("gun", 20, 50);
        PlayGame.makeDamage(gs);
        PlayGame.makeDamage(gun);
    }
}
