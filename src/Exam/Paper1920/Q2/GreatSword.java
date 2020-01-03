package Exam.Paper1920.Q2;

public class GreatSword extends Weapon {
    private double shapeness; //for Great Sword only

    public GreatSword(String name, double shapeness) {
        super(name);
        this.shapeness = shapeness;
    }

    @Override
    public void makeDamage() {
        System.out.print("Input the charge: ");
        double charge = sc.nextDouble();
        System.out.println("Damage on Great Sword: " + (charge * shapeness * 100));
    }
}
