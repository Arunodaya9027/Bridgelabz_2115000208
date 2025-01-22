import java.util.*;

public class ComputeQuotientAndReminder {
	public static void main(String[] args) {
		int number1, number2;
		Scanner input = new Scanner(System.in);
		number1 = input.nextInt();
		number2 = input.nextInt();
		int quotient = number1 / number2;
		int reminder = number1 % number2;

		// Printing Output Using Formatted Print Stream
		System.out.printf("The Quotient is %d and Reminder is %d of two number %d and %d", quotient, reminder, number1, number2);
		input.close();
	}
}
