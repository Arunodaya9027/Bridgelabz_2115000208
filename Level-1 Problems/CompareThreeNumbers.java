import java.util.*;

public class CompareThreeNumbers{
	public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
		int largest, smallest;
		largest = Math.max(number1, Math.max(number2, number3));
		smallest = Math.min(number1, Math.min(number2, number3));
		return new int[]{largest, smallest};
	}
	
	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner input = new Scanner(System.in);
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		int[] result = findSmallestAndLargest(num1, num2, num3);
		System.out.printf("From the three numbers, %d is the largest while %d is the smallest number.", result[0], result[1]);
		input.close();
	}
}