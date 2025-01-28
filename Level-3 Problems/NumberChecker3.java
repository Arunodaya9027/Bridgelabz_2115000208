import java.util.*;

public class NumberChecker3 {
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

    public static int[] reverseDigits(int[] digits) {
        int[] reversedDigits = new int[digits.length];
        for (int i = 0; i < digits.length; i++)
            reversedDigits[i] = digits[digits.length - 1 - i];
        return reversedDigits;
    }

    public static boolean compareArrays(int[] digits, int[] reversedDigits) {
        return Arrays.equals(digits, reversedDigits);
    }

    public static boolean isPalindromeNumber(int[] digits) {
        for (int i = 0; i < digits.length / 2; i++) {
            if (digits[i] != digits[digits.length - 1 - i])
                return false;
        }
        return true;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int count = findCount(number);
        System.out.printf("The number %d has %d digits\n", number, count);
        int[] digits = storeDigits(number, count);
        System.out.printf("The digits of the number %d are: %s\n", number, Arrays.toString(digits));
        int[] reversedDigits = reverseDigits(digits);
        System.out.printf("The reversed digits of the number %d are: %s\n", number, Arrays.toString(reversedDigits));
        boolean isEqual = compareArrays(digits, reversedDigits);
        System.out.printf("The digits of the number %d are %s to the reversed digits\n", number, isEqual ? "equal" : "not equal");
        boolean isPalindrome = isPalindromeNumber(digits);
        System.out.printf("The number %d is %s palindrome number\n", number, isPalindrome ? "a" : "not a");
        boolean isDuck = isDuckNumber(digits);
        System.out.printf("The number %d is %s duck number\n", number, isDuck ? "a" : "not a");
        input.close();
    }
}
