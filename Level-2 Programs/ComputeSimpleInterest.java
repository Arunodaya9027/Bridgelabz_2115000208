import java.util.*;

public class ComputeSimpleInterest {
    public static void main(String[] args) {
        double principal, rate, time;
        Scanner input = new Scanner(System.in);
        principal = input.nextDouble();
        rate = input.nextDouble();
        time = input.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f", simpleInterest, principal, rate, time);
        input.close();
    }
}
