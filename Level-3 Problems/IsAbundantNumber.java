import java.util.*;

public class IsAbundantNumber {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int sum = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        if(sum > number)
            System.out.println("Abundant Number");
        else
            System.out.println("Not an Abundant Number");
        input.close();
    }
}
