import java.util.*;

public class DivisionOfNumbers{
	public static int[] findRemainderAndQuotient(int number, int divisor){
		int quotient, remainder;
		quotient = number / divisor;
		remainder = number % divisor;
		return new int[]{quotient, remainder};
	}
	
	public static void main(String[] args) {
		int number, divisor;
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		divisor = input.nextInt();
		int[] result = findRemainderAndQuotient(number, divisor);
		System.out.printf("After dividing %d by %d, we get %d as quotient and %d as remainder.", number, divisor, quotient, remainder);
		input.close();
	}
}