import java.util.*;

public class FizzBuzzWhileLoop {
	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		if(number > 0) {
			int i = 0;
			while(i<=number) {
				if(i % 3 == 0) 
					System.out.print("Fizz");
				if(i % 5 == 0)
					System.out.print("Buzz");
				if(i%3 != 0 && i%5 != 0)
					System.out.print(i);
				System.out.println();
				i++;
			}
		}
		else 
			System.out.println("Only Positive Integer Input for this problem");
		input.close();
	}
}