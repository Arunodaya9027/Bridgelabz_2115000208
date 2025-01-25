import java.util.*;

public class BMIModified {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();
        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter the weight of person " + (i + 1) + ": ");
            double weight = input.nextDouble();
            System.out.print("Enter the height of person " + (i + 1) + ": ");
            double height = input.nextDouble();
            if (weight <= 0 || height <= 0) {
                System.out.println("Invalid input. Please enter again.");
                i--;
                continue;
            }
            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = weight / (height * height);
            if (personData[i][2] < 18.5) 
                weightStatus[i] = "Underweight";
            else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) 
                weightStatus[i] = "Normal";
            else if (personData[i][2] >= 25 && personData[i][2] < 39.9) 
                weightStatus[i] = "Overweight";
            else 
                weightStatus[i] = "Obese";
        }
        System.out.println("Height\tWeight\tBMI\tWeight Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
        input.close();
    }
}
