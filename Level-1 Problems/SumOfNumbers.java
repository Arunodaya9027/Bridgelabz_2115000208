import java.util.*;

public class SumOfNumbers {
    public static void main(String[] args) {
        double total = 0.0, number;
        Scanner input = new Scanner(System.in);
        while(true){
            number = input.nextDouble();
            if(number == 0){
                break;
            }
            total += number;
        }
        System.out.println(total);
        input.close();
    }
}
