import java.util.*;

public class IntOperation {
	public static void main(String[] args) {
		int a, b, c;
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		int result1 = a+b*c;		// Operation 1
		int result2 = a*b+c;		// Operation 2
		int result3 = c+a/b;		// Operation 3
		int result4 = a%b+c;		// Operation 4
		System.out.printf("The results of Int Operations are %d, %d, %d and %d.", result1, result2, result3, result4);
		input.close();
	}
}