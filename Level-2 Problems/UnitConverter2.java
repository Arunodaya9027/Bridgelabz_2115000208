import java.util.*;

public class UnitConverter2 {
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        double yards, feet, meters, inches;
        Scanner input = new Scanner(System.in);
        yards = input.nextDouble();
        feet = input.nextDouble();
        meters = input.nextDouble();
        inches = input.nextDouble();

        System.out.printf("%.2f yards is %.2f feet\n", yards, convertYardsToFeet(yards));
        System.out.printf("%.2f feet is %.2f yards\n", feet, convertFeetToYards(feet));
        System.out.printf("%.2f meters is %.2f inches\n", meters, convertMetersToInches(meters));
        System.out.printf("%.2f inches is %.2f meters\n", inches, convertInchesToMeters(inches));
        System.out.printf("%.2f inches is %.2f cm\n", inches, convertInchesToCm(inches));
        input.close();
    }
}
