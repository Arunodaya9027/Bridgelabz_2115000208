public class RecursiveVsIterativeFibonacciComputation {
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
    
    public static void compare(int size) {
        System.out.printf("For Dataset Size %d:\n", size);

        double start = System.nanoTime();
        System.out.printf("Fibonacci through Recursion is %d\n", fibonacciRecursive(size));
        double end = System.nanoTime();
        System.out.printf("Time taken by Recursive Fibonacci Algorithm is %.4f ms\n", (end - start)/1000000);

        start = System.nanoTime();
        System.out.printf("Fibonacci through Iteration is %d\n", fibonacciIterative(size));
        end = System.nanoTime();
        System.out.printf("Time taken by Iterative Fibonacci Algorithm is %.4f ms\n", (end - start)/1000000);
        System.out.println();
    }

    public static void main(String[] args) {
        compare(10);
        compare(30);
        compare(50);
    }
}