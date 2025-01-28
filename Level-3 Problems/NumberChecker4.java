import java.util.*;

public class NumberChecker4 {
    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    public static boolean isSpy(int number) {
        int sum = 0, product = 1;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int number) {
        int square = number * number;
        return square % (int) Math.pow(10, String.valueOf(number).length()) == number;
    }

    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        boolean isPrime = isPrime(number);
        System.out.printf("The number %d is %s prime number\n", number, isPrime ? "a" : "not a");
        boolean isNeon = isNeon(number);
        System.out.printf("The number %d is %s neon number\n", number, isNeon ? "a" : "not a");
        boolean isSpy = isSpy(number);
        System.out.printf("The number %d is %s spy number\n", number, isSpy ? "a" : "not a");
        boolean isAutomorphic = isAutomorphic(number);
        System.out.printf("The number %d is %s automorphic number\n", number, isAutomorphic ? "an" : "not an");
        boolean isBuzz = isBuzz(number);
        System.out.printf("The number %d is %s buzz number\n", number, isBuzz ? "a" : "not a");
        input.close();
    }
}
