import java.util.*;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        if(number > 0){
            int sum = number * (number + 1) / 2;
            System.out.printf("The sum of %d natural numbers is %d", number, sum);
        }else{
            System.out.printf("The number %d is not a natural number", number);
        }
        input.close();
    }
}
