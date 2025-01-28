import java.util.*;

public class MaximumNumberOfHandShakes {
	public int handshakes(int student) {
		int possibleHandshakes = student * (student-1) / 2;
		return possibleHandshakes;
	}
	
	public static void main(String[] args) {
		int totalStudents, possibleHandshakes;
		Scanner input = new Scanner(System.in);
		totalStudents = input.nextInt();
		MaximumNumberOfHandShakes hs = new MaximumNumberOfHandShakes();
		possibleHandshakes = hs.handshakes(totalStudents);
		System.out.printf("There are only %d Handshakes possible between %d students.", possibleHandshakes, totalStudents);
		input.close();
	}
}
