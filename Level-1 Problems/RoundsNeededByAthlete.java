import java.util.*;

public class RoundsNeededByAthlete {
	public double rounds(int perimeter) {
		int totalRounds = 5000/perimeter;
		return totalRounds;
	}
	
	public static void main(String[] args) {
		int side1, side2, side3, perimeter;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter all sides of triangular park in meters:");
		side1 = input.nextInt();
		side2 = input.nextInt();
		side3 = input.nextInt();
		perimeter = input.nextInt();
		RoundsNeededByAthlete ath = new RoundsNeededByAthlete();
		int completedRounds = ath.rounds(perimeter);
		System.out.printf("For 5 kms, athlete need to run %d rounds of a given dimensions Triangular Park", completedRounds);
		ath.close();
		input.close();
	}
}