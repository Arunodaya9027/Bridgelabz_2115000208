import java.util.*;

public class StoreValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            double value = input.nextDouble();
            if (value <= 0 || index == 10) 
                break;
            values[index++] = value;
        }

        for (double value: values) 
            total += value;

        System.out.printf("The total of all stored values is %.2f", total);
        input.close();
    }
}