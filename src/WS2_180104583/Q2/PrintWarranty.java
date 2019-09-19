package WS2_180104583.Q2;

public class PrintWarranty {
    public static void printExtendedWarrantyPrice(Appliance app) {
        double amt = app.getExtendedWarrantyPrice();
        if (amt > 0)
            System.out.println("Extended Warranty Price is HKD " + app.getExtendedWarrantyPrice());
        else
            System.out.println("Extended Warranty for the appliance is not provided.");
    }
}
