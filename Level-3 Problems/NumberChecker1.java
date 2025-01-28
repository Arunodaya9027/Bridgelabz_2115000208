import java.util.*;

public class NumberChecker1 {
    public static int findCount(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int[] storeDigits(int number, int count) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0)
                return true;
        }
        return false;
    }

    public static boolean isArmstrongNumber(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++)
            sum += Math.pow(digits[i], digits.length);
        return sum == Integer.parseInt(Arrays.toString(digits).replaceAll("\\D", ""));
    }

    public static int[] findLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
			else if (digits[i] > secondLargest)
                secondLargest = digits[i];
        }
        return new int[] { largest, secondLargest };
    }

    public static int[] findSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } 
			else if (digits[i] < secondSmallest)
                secondSmallest = digits[i];
        }
        return new int[] { smallest, secondSmallest };
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int count = findCount(number);
        System.out.printf("The number %d has %d digits\n", number, count);
        int[] digits = storeDigits(number, count);
        System.out.printf("The digits of the number %d are: %s\n", number, Arrays.toString(digits));
        boolean isDuck = isDuckNumber(digits);
        System.out.printf("The number %d is %s duck number\n", number, isDuck ? "a" : "not a");
        boolean isArmstrong = isArmstrongNumber(digits);
        System.out.printf("The number %d is %s Armstrong number\n", number, isArmstrong ? "an" : "not an");
        int[] largest = findLargest(digits);
        System.out.printf("The largest digit in the number %d is %d and the second largest digit is %d\n", number, largest[0], largest[1]);
        int[] smallest = findSmallest(digits);
        System.out.printf("The smallest digit in the number %d is %d and the second smallest digit is %d\n", number, smallest[0], smallest[1]);
        input.close();
    }
}
