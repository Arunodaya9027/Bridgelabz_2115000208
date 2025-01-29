import java.util.*;

public class BasicCalculator {
    private static void Calculator(double num1, double num2, char operator) {
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.printf("The sum of %f and %f is %f.%n", num1, num2, result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("The difference between %f and %f is %f.%n", num1, num2, result);
                break;
            case '*':
                result = num1 * num2;
                System.out.printf("The product of %f and %f is %f.%n", num1, num2, result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.printf("Cannot divide by zero.");
                } else {
                    result = num1 / num2;
                    System.out.printf("The quotient of %f and %f is %f.%n", num1, num2, result);
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
    public static void main(String[] args) {
        double num1, num2;
        char operator;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two number for operation");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        operator = input.next().charAt(0);
        Calculator(num1, num2, operator);        
        input.close();
    }
}