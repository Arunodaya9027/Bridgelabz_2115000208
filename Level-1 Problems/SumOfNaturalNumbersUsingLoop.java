import java.util.*;

public class SumOfNaturalNumbersUsingLoop {
	private static int compute(int num) {
		int sum = 0;
		for(int i = 1; i <= num; i++)
			sum += i;
		return sum;
	}
	
    public static void main(String[] args) {
        int number, sum;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
		if(number <= 0) {
			System.err.println("Invalid Natural Number");
			System.exit(1);
		}
        sum = compute(number);
		System.out.printf("The sum of %d natural numbers using loop is %d\n", number, sum);
        input.close();
    }
}