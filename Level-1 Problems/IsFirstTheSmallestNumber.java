import java.util.*;

public class IsFirstTheSmallestNumber {
    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner input = new Scanner(System.in);
        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();
        if(number1 < number2 && number1 < number3){
            System.out.printf("Is the first number the smallest? true");
        }else{
            System.out.printf("Is the first number the smallest? false");
        }
        input.close();
    }
}