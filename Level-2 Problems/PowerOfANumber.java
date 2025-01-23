import java.util.*;

public class PowerOfANumber {
    public static void main(String[] args) {
        int number, power;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        power = input.nextInt();
        int result = 1;
        for(int i = 1; i <= power; i++){
            result *= number;
        }
        System.out.println(result);
        input.close();
    }
}
