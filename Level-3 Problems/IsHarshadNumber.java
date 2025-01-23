import java.util.*;

public class IsHarshadNumber {
    public static void main(String[] args) {
        int number, originalNumber;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int sum = 0;
        originalNumber = number;
        while(originalNumber != 0){
            int remainder = originalNumber % 10;
            sum += remainder;
            originalNumber /= 10;
        }
        if(number % sum == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not a Harshad Number");
        input.close();
    }
}
