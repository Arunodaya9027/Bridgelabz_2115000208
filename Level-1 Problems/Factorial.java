import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        int number, factorial = 1;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        if(number > 0){
            int i = 1;
            while(i <= number){
                factorial *= i;
                i++;
            }
            System.out.printf("The factorial of %d is %d", number, factorial);
        }else{
            System.out.printf("The number %d is not a positive integer", number);
        }
        input.close();
    }
}
