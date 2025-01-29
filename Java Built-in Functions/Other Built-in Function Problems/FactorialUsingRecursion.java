import java.util.*;

public class FactorialUsingRecursion {
    public static int factorial(int n) {
        if (n <= 0) 
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int factorialOfNumber = factorial(number);
        System.out.printf("The factorial of %d is %d.", number, factorialOfNumber);
        input.close();
    }
}