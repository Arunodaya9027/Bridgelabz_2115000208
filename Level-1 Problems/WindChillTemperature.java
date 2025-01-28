import java.util.*;

public class WindChillTemperature {
	public double calculateWindChill(double temp, double windSpeed) {
		double windChill;
		windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * Math.pow(windSpeed, 0.16);
		return windChill;
	}
	
	public static void main(String[] args) {
		double temperature, windSpeed, windChill;
		Scanner input = new Scanner(System.in);
		temperature = input.nextDouble();
		windSpeed = input.nextDouble();
		WindChillTemperature wc = new WindChillTemperature();
		windChill = wc.calculateWindChill(temperature, windSpeed);
		System.out.printf("The Wind Chill temperature is %.2f at temperature %.2f and wind speed %.2f", windChill, temperature, windSpeed);
		input.close();
	}
}