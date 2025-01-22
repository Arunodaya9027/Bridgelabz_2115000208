import java.util.*;

public class SwapNumbers {
    public static void main(String[] args) {
        int number1, number2;
        Scanner input = new Scanner(System.in);
        number1 = input.nextInt();
        number2 = input.nextInt();
        number1 = number1 + number2 - (number2 = number1);
        System.out.printf("The swapped numbers are %d and %d", number1, number2);
        input.close();
    }    
}
