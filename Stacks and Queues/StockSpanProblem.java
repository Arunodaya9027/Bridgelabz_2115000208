import java.util.*;

public class StockSpanProblem {
    private static int[] stockSpan(int[] stockPrices, int n) {
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        span[0] = 1;
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && stockPrices[stack.peek()] <= stockPrices[i])
                stack.pop();
            span[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of days:");
        int n = input.nextInt();
        int[] stockPrices = new int[n];
        System.out.println("Enter stock prices:");
        for (int i = 0; i < n; i++) 
            stockPrices[i] = input.nextInt();

        int[] span = stockSpan(stockPrices, n);
        System.out.println("Stock span:");
        for (int i = 0; i < n; i++) {
            System.out.print(span[i] + " ");
        }
        input.close();
    }
}
