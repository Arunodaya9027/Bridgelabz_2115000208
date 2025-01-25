import java.util.*;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();
        double[] weight = new double[numberOfPersons];
        double[] height = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] weightStatus = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter the weight of person " + (i + 1) + ": ");
            weight[i] = input.nextDouble();
            System.out.print("Enter the height of person " + (i + 1) + ": ");
            height[i] = input.nextDouble();
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] < 18.5) 
                weightStatus[i] = "Underweight";
            else if (bmi[i] >= 18.5 && bmi[i] < 24.9) 
                weightStatus[i] = "Normal";
            else if (bmi[i] >= 25 && bmi[i] < 39.9) 
                weightStatus[i] = "Overweight";
            else 
                weightStatus[i] = "Obese";
        }
        System.out.println("Height\tWeight\tBMI\tWeight Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", height[i], weight[i], bmi[i], weightStatus[i]);
        }
        input.close();
    }
}