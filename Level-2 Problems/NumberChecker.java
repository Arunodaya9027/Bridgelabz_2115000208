
import java.util.*;

public class NumberChecker {
    public static String isPositive(int num) {
        if (num > 0) {
            return "positive";
        } else if (num < 0) {
            return "negative";
        }
        return "zero";
    }

    public static String isEven(int num) {
        if (num % 2 == 0) {
            return "even";
        }
        return "odd";
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 < num2) {
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
            if (isPositive(numbers[i]).equals("positive")) {
                System.out.printf("%d is %s and %s\n", numbers[i], isPositive(numbers[i]), isEven(numbers[i]));
            } else {
                System.out.printf("%d is %s\n", numbers[i], isPositive(numbers[i]));
            }
        }

        if (compare(numbers[0], numbers[4]) == 1) {
            System.out.printf("%d is greater than %d\n", numbers[0], numbers[4]);
        } else if (compare(numbers[0], numbers[4]) == -1) {
            System.out.printf("%d is less than %d\n", numbers[0], numbers[4]);
        } else {
            System.out.printf("%d is equal to %d\n", numbers[0], numbers[4]);
        }
        input.close();
    }
}

