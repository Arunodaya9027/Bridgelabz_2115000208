import java.util.*;

public class UnitConverter1 {
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        double km, miles, meters, feet;
        Scanner input = new Scanner(System.in);
        km = input.nextDouble();
        miles = input.nextDouble();
        meters = input.nextDouble();
        feet = input.nextDouble();

        System.out.printf("%.2f km is %.2f miles\n", km, convertKmToMiles(km));
        System.out.printf("%.2f miles is %.2f km\n", miles, convertMilesToKm(miles));
        System.out.printf("%.2f meters is %.2f feet\n", meters, convertMetersToFeet(meters));
        System.out.printf("%.2f feet is %.2f meters\n", feet, convertFeetToMeters(feet));
        input.close();
    }
} 
