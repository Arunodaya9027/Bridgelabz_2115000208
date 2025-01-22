import java.util.*;

public class DoubleOpt {
	public static void main(String[] args) {
		double a, b, c;
		Scanner input = new Scanner(System.in);
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		double result1 = a+b*c;		// Operation 1
		double result2 = a*b+c;		// Operation 2
		double result3 = c+a/b;		// Operation 3
		double result4 = a%b+c;		// Operation 4
		System.out.printf("The results of Double Operations are %.4f, %.4f, %.4f and %.4f.", result1, result2, result3, result4);
		input.close();
	}
}