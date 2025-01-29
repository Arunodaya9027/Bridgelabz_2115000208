import java.util.*;

public class GCDAndLCMCalculator {
    public static int GCD(int divisor, int dividend){
        while(dividend % divisor != 0){
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        return divisor;
    }

    public static int LCM(int num1, int num2, int gcd){
        return (num1 * num2) / gcd;
    }

    public static void main(String[] args) {
        int num1, num2, gcd, lcm;
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        num2 = input.nextInt();

        gcd = GCD(num1, num2);
        lcm = LCM(num1, num2, gcd);
        System.out.printf("The GCD of %d  and %d is %d.\n", num1, num2, gcd);
        System.out.printf("The LCM of %d and %d is %d.\n", num1, num2, lcm);
        input.close();
    }
}