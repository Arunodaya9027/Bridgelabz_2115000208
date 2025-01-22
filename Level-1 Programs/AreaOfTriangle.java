import java.util.*;

public class AreaOfTriangle {
	public static void main(String[] args) {
		double base, height;
		Scanner input = new Scanner(System.in);
		base = input.nextDouble();		// Base of Triangle
		height = input.nextDouble();		// Height of Triangle
		double areaInCm = 0.5*base*height;		// Area of Triangle in centimeters
		double areaInInches = areaInCm / 2.54;			// Area of Triangle in Inches
		double areaInFeet = areaInInches / 12;			// Area of Triangle in feet
		System.out.println("Your Area in cm is " + areaInCm + " while in feet is " + areaInFeet + " and inches is " + areaInInches);
		input.close();
	}
}
