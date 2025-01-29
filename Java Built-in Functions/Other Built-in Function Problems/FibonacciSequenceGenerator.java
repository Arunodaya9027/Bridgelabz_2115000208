import java.util.*;

public class FibonacciSequenceGenerator {
    public static void generateFibonacciSequence(int n, int first, int second) {
        if (n > 0) {
            System.out.print(first + " ");
            generateFibonacciSequence(n - 1, second, first + second);
        }
    }
    
    public static void main(String[] args) {
        int range, first = 0, second = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sequence input to generate: ");
        range = input.nextInt();

        System.out.printf("The first %d terms of the Fibonacci sequence are: ", range);
        generateFibonacciSequence(range, first, second);
        input.close();
    }
}