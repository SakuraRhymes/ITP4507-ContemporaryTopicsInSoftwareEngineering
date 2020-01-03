package Exam.Paper1920.Q2;

public class Gun extends Weapon {
    private double bulletpower, range;

    public Gun(String name, double bulletpower, double range) {
        super(name);
        this.bulletpower = bulletpower;
        this.range = range;
    }

    @Override
    public void makeDamage() {
        System.out.print("Distance to target: ");
        double distance = sc.nextDouble();
        System.out.println("Damage on Gun: " + (bulletpower * range / distance));
    }
}
