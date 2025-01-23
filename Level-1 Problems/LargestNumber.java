import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner input = new Scanner(System.in);
        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();
        if(number1 > number2 && number1 > number3){
            System.out.printf("Is the first number the largest? true\n");
        }else{
            System.out.printf("Is the first number the largest? false\n");
        }

        if(number2 > number1 && number2 > number3){
            System.out.printf("Is the second number the largest? true\n");
        }else{
            System.out.printf("Is the second number the largest? false\n");
        }
        
        if(number3 > number1 && number3 > number2){
            System.out.printf("Is the third number the largest? true\n");
        }else{
            System.out.printf("Is the third number the largest? false\n");
        }
        input.close();
    }
}