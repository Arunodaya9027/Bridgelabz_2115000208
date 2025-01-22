import java.util.*;

public class ComputeSideOfSquare {
	public static void main(String[] args) {
		double perimeter;
		Scanner input = new Scanner(System.in);
		perimeter = input.nextDouble();		// Perimeter of the square
		double side = perimeter / 4;		// Computing Side Of Square, since (Side of Square)*4 = Perimeter of Square
		System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
		input.close();
	}
}
