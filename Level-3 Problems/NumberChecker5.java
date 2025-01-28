import java.util.*;
public class NumberChecker5 {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                factors[index++] = i;
        }
        return factors;
    }

    public static int findGreatestFactor(int[] factors) {
        int greatestFactor = Integer.MIN_VALUE;
        for (int factor : factors) {
            if (factor > greatestFactor)
                greatestFactor = factor;
        }
        return greatestFactor;
    }

    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors)
            sum += factor;
        return sum;
    }

    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors)
            product *= factor;
        return product;
    }

    public static int findProductOfCubeOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors)
            product *= Math.pow(factor, 3);
        return product;
    }

    public static boolean isPerfectNumber(int number, int sumOfFactors) {
        return sumOfFactors - number == number;
    }

    public static boolean isAbundantNumber(int number, int sumOfFactors) {
        return sumOfFactors - number > number;
    }

    public static boolean isDeficientNumber(int number, int sumOfFactors) {
        return sumOfFactors - number < number;
    }

    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += findFactorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static int findFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++)
            factorial *= i;
        return factorial;
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int[] factors = findFactors(number);
        System.out.printf("The factors of the number %d are: %s\n", number, Arrays.toString(factors));
        int greatestFactor = findGreatestFactor(factors);
        System.out.printf("The greatest factor of the number %d is %d\n", number, greatestFactor);
        int sumOfFactors = findSumOfFactors(factors);
        System.out.printf("The sum of the factors of the number %d is %d\n", number, sumOfFactors);
        int productOfFactors = findProductOfFactors(factors);
        System.out.printf("The product of the factors of the number %d is %d\n", number, productOfFactors);
        int productOfCubeOfFactors = findProductOfCubeOfFactors(factors);
        System.out.printf("The product of the cube of the factors of the number %d is %d\n", number, productOfCubeOfFactors);
        boolean isPerfect = isPerfectNumber(number, sumOfFactors);
        System.out.printf("The number %d is %s perfect number\n", number, isPerfect ? "a" : "not a");
        boolean isAbundant = isAbundantNumber(number, sumOfFactors);
        System.out.printf("The number %d is %s abundant number\n", number, isAbundant ? "an" : "not an");
        boolean isDeficient = isDeficientNumber(number, sumOfFactors);
        System.out.printf("The number %d is %s deficient number\n", number, isDeficient ? "a" : "not a");
        boolean isStrong = isStrongNumber(number);
        System.out.printf("The number %d is %s strong number\n", number, isStrong ? "a" : "not a");
        input.close();
    }
}
