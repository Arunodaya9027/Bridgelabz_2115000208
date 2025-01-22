import java.util.*;

public class KmToMilesCalculatorInput {
    public static void main(String[] args) {
        double km;
        Scanner input = new Scanner(System.in);
        km = input.nextInt();			// Distance taken in km
        double miles = km / 1.6;		// Distance in miles
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        input.close();
    }
}
