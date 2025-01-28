import java.util.*;

public class EqualDivisionOfChocolates {
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int quotient, remainder;
		quotient = number / divisor;
		remainder = number % divisor;
		return new int[]{quotient, remainder};
	}
	public static void main(String[] args) {
		int totalChocolates, totalStudents;
		Scanner input = new Scanner(System.in);
		totalChocolates = input.nextInt();
		totalStudents = input.nextInt();
		int[] result = findRemainderAndQuotient(totalChocolates, totalStudents);
		System.out.printf("So, Every student get the %d chocolates and %d chocolates remained undistributed.", result[0], result[1]);
		input.close();
	}
}