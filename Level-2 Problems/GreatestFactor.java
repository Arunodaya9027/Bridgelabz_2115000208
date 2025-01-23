import java.util.*;

public class GreatestFactor {
    public static void main(String[] args) {
        int number, greatestFactor = 1;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        for(int i = number - 1; i >= 1; i--){
            if(number % i == 0){
                greatestFactor = i;
                break;
            }
        }
        System.out.println(greatestFactor);
        input.close();
    }
}
