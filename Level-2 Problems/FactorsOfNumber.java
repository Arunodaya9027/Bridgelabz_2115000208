import java.util.*;

public class FactorsOfNumber {
	private static int[] findFactors(int number) {
		int count=0;
		for(int i = 1; i < number; i++)
            if(number % i == 0)
                count++;
		
		int[] factors = new int[count];
		int index = 0;
		for(int i = 1; i < number; i++)
		    if(number % i == 0)
                factors[index++] = i;
		
		return factors;
	}
	
	private int sumOfFactors(int[] factors) {
		int sum = 0;
		for(int num: factors)
			sum += num;
		return sum;
	}
	
	private int productOfFactors(int[] factors) {
		int product = 1;
		for(int num: factors)
			product *= num;
		return product;
	}
	
	private int sumOfSquareOfFactors(int[] factors) {
		int sumOfSquares = 0;
		for(int num: factors)
			sumOfSquares += (int)(Math.pow(num, 2));
		return sumOfSquares;
	}
	
	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		int[] factors = findFactors(number);
		System.out.printf("The Factors of %d are: \n", number);
		for(int num: factors)
			System.out.printf("%d ", num);
		
		FactorsOfNumber fc = new FactorsOfNumber();
		System.out.printf("The Sum of all factors is %d", fc.sumOfFactors(factors));
		System.out.printf("The Product of all factors is %d", fc.productOfFactors(factors));
		System.out.printf("The Sum of Squares of all factors is %d", fc.sumOfSquareOfFactors(factors));
		input.close();
	}
}