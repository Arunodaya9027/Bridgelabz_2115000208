import java.util.*;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number <= 0) {
            System.err.println("Error! Please enter a natural number");
            System.exit(0);
        }

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
            }
        }

        System.out.printf("Factors of %d are: ", number);
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        input.close();
    }
}
