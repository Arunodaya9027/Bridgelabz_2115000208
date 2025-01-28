import java.util.*;

public class MaximumNumberOfHandShakes2 {
	public int handshakes(int student) {
		int possibleHandshakes = student * (student-1) / 2;
		return possibleHandshakes;
	}
	
	public static void main(String[] args) {
		int numberOfStudents, possibleHandshakes;
		Scanner input = new Scanner(System.in);
		numberOfStudents = input.nextInt();
		MaximumNumberOfHandShakes hs = new MaximumNumberOfHandShakes();
		possibleHandshakes = hs.handshakes(numberOfStudents);
		System.out.printf("There are only %d Handshakes possible between %d students.", possibleHandshakes, numberOfStudents);
		input.close();
	}
}
