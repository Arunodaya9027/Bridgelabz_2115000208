import java.util.*;

public class DivisibleByFive {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        if(number % 5 == 0){
            System.out.printf("Is the number %d divisible by 5? true", number);
        }else{
            System.out.printf("Is the number %d divisible by 5? false", number);
        }
        input.close();
    }
}