import java.util.*;

public class NumberChecker2 {
    public static int findCount(int number) {
        return String.valueOf(number).length();
    }

    public static int[] storeDigits(int number, int count) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int findSum(int[] digits) {
        int sum = 0;
        for (int digit : digits)
            sum += digit;
        return sum;
    }

    public static int findSumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits)
            sum += Math.pow(digit, 2);
        return sum;
    }

    public static boolean isHarshadNumber(int[] digits) {
        int sum = findSum(digits);
        return sum != 0 && Integer.parseInt(Arrays.toString(digits).replaceAll("\\D", "")) % sum == 0;
    }

    public static int[][] findFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }
        for (int digit : digits)
            frequency[digit][1]++;
        return frequency;
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int count = findCount(number);
        System.out.printf("The number %d has %d digits\n", number, count);
        int[] digits = storeDigits(number, count);
        System.out.printf("The digits of the number %d are: %s\n", number, Arrays.toString(digits));
        int sum = findSum(digits);
        System.out.printf("The sum of the digits of the number %d is %d\n", number, sum);
        int sumOfSquares = findSumOfSquares(digits);
        System.out.printf("The sum of the squares of the digits of the number %d is %d\n", number, sumOfSquares);
        boolean isHarshad = isHarshadNumber(digits);
        System.out.printf("The number %d is %s Harshad number\n", number, isHarshad ? "a" : "not a");
        int[][] frequency = findFrequency(digits);
        System.out.printf("The frequency of each digit in the number %d is: %s\n", number, Arrays.deepToString(frequency));
        input.close();
    }
}
