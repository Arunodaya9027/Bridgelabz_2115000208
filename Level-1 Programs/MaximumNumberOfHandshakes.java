import java.util.*;

public class MaximumNumberOfHandshakes {
	public static void main(String[] args) {
		int numberOfStudents;
		Scanner input = new Scanner(System.in);
		numberOfStudents = input.nextInt();
		// Using Combination Formula for computing maximum no. of Handshakes
		int maximumHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
		System.out.println("The maximum number of possible handshakes is "+ maximumHandshakes +" Handshakes");
		input.close();
	}
}
