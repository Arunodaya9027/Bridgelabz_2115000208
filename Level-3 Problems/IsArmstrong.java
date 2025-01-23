import java.util.*;

public class IsArmstrong {
    public static void main(String[] args) {
        int number, originalNumber;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int sum = 0;
        originalNumber = number;
        while(originalNumber != 0){
            int remainder = originalNumber % 10;
            sum += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if(number == sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
        input.close();
    }
}
