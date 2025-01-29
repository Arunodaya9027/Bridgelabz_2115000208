import java.util.*;

public class TemperatureConvertor {
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        double temperature, convertedTemperature;
        String unit;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        temperature = input.nextDouble();
        System.out.print("Enter unit (C/F): ");
        unit = input.nextLine();

        if (unit.equalsIgnoreCase("C")) {
            convertedTemperature = celsiusToFahrenheit(temperature);
            System.out.println(temperature + "°C is equal to " + convertedTemperature + "°F.");
        } 
        else if (unit.equalsIgnoreCase("F")) {
            convertedTemperature = fahrenheitToCelsius(temperature);
            System.out.println(temperature + "°F is equal to " + convertedTemperature + "°C.");
        } 
        else 
            System.out.println("Invalid unit.");
        input.close();
    }
}