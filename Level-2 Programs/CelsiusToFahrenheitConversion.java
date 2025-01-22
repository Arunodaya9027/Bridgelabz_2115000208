import java.util.*;

public class CelsiusToFahrenheitConversion {
	public static void main(String[] args) {
		double celsius;
		Scanner input = new Scanner(System.in);
		celsius = input.nextDouble();
		//Celsius to Fahrenheit Temperature Conversion Formula
		double fahrenheitResult = (celsius * 9/5) + 32;
		System.out.printf("The %.2f celsius is %.2f fahrenheit", celsius, fahrenheitResult);
		input.close();
	}
}