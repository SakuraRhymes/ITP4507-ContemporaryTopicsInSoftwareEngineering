package Exam.Paper1920.Q2;

import java.util.Scanner;

abstract class Weapon {
    public static Scanner sc = new Scanner(System.in);
    private String name; // Weapon name

    public Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeDamage();
}