import java.util.*;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        if(number > 0){
            for(int i = 1; i <= number; i++){
                sum += i;
            }
            int formulae = number * (number + 1) / 2;
            System.out.printf("The sum of %d natural numbers is %d\n", number, sum);
            System.out.printf("The sum of %d natural numbers using formulae is %d\n", number, formulae);
        }else{
            System.out.printf("The number %d is not a natural number", number);
        }
        input.close();
    }
}   