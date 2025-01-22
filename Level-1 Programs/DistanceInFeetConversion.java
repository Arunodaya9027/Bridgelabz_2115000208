import java.util.*;

public class DistanceInFeetConversion {
	public static void main(String[] args) {
		double distanceInFeet;
		Scanner input = new Scanner(System.in);
		distanceInFeet = input.nextDouble();		// Distance in Feets
		double distanceInYards = distanceInFeet/3;			// Converted to yards
		double distanceInMiles = distanceInYards/1760;		// Converted to miles
		System.out.println("Your Distance in feets is "+ distanceInFeet +" while in yards is "+ distanceInYards +" and miles is " + distanceInMiles);
		input.close();
	}
}
