import java.util.*;

public class MaximumOfThreeNumber {
    public static int maximum(int a, int b, int c) {
        if (a >= b && a >= c) 
            return a;
        else if (b >= a && b >= c) 
            return b;
        return c;
    }

    public static void main(String[] args) {
        int num1, num2, num3, max;
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        max = maximum(num1, num2, num3);
        System.out.println("The maximum of the three numbers is " + max);
        input.close();
    }
}