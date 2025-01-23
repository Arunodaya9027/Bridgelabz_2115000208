import java.util.*;

public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {
        double number1, number2;
        String op;
        Scanner input = new Scanner(System.in);
        number1 = input.nextDouble();
        number2 = input.nextDouble();
        op = input.next();
        switch(op){
            case "+":
                System.out.printf("Your Output is ",number1 + number2);
                break;
            case "-":
                System.out.printf("Your Output is ",number1 - number2);
                break;
            case "*":
                System.out.printf("Your Output is ",number1 * number2);
                break;
            case "/":
                System.out.printf("Your Output is ",number1 / number2);
                break;
            default:
                System.out.println("Invalid Operator");
        }
        input.close();
    }
}
