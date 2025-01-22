import java.util.*;

public class FahrenheitToCelsiusConversion {
	public static void main(String[] args) {
		double fahrenheit;
		Scanner input = new Scanner(System.in);
		fahrenheit = input.nextDouble();
		//Fahrenheit to Celsius Temperature Conversion Formula
		double celsiusResult = (fahrenheit - 32) * 5/9;
		System.out.printf("The %.2f fahrenheit is %.2f celsius", fahrenheit, celsiusResult);
		input.close();
	}
}