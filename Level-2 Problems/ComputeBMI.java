import java.util.*;

public class ComputeBMI {
	public static void main(String[] args) {
		double weight, height;
		Scanner input = new Scanner(System.in);
		weight = input.nextDouble();		// Weight in kg
		height = input.nextDouble();		// Height in cm
		double bmi = weight/(height/100 * height/100);
		
		if(bmi <= 18.4)
			System.out.printf("You are Underweight. Your BMI is %.2f.", bmi);
		else if(bmi < 25)
			System.out.printf("You are Normal weight. Your BMI is %.2f.", bmi);
		else if(bmi < 40)
			System.out.printf("You are Overweight. Your BMI is %.2f.", bmi);
		else
			System.out.printf("You are Obese. Your BMI is %.2f.", bmi);
		input.close();
	}
}