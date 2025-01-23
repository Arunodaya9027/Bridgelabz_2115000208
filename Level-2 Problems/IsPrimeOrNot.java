import java.util.*;

public class IsPrimeOrNot {
	public static void main(String[] args) {
		int number;
		boolean isPrime = true;
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		if (number < 2) {
			isPrime = false;
		} else {
			for(int i=2; i<=Math.sqrt(number); i++) {
				if(number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		
		if(isPrime)
			System.out.printf("%d is a prime number", number);
		else
			System.out.printf("%d is not a prime number", number);
		input.close();
	}
}