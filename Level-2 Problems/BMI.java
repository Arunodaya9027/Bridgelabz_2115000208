import java.util.*;

public class BMI {
    public static double calculateBMI(double weight, double height) {
        return weight / ((height / 100) * (height / 100));
    }

    public static String[] findBMIStatus(double[][] arr) {
        String[] status = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][2] < 18.5) {
                status[i] = "Underweight";
            } else if (arr[i][2] >= 18.5 && arr[i][2] < 24.9) {
                status[i] = "Normal weight";
            } else if (arr[i][2] >= 24.9 && arr[i][2] < 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        double[][] arr = new double[10][3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i][0] = input.nextDouble();
            arr[i][1] = input.nextDouble();
            arr[i][2] = calculateBMI(arr[i][0], arr[i][1]);
        }

        String[] status = findBMIStatus(arr);
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d: Weight %.2f kg, Height %.2f cm, BMI %.2f, Status %s\n", i + 1, arr[i][0], arr[i][1], arr[i][2], status[i]);
        }
        input.close();
    }
}

 