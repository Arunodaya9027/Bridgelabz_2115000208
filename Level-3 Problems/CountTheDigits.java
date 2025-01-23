import java.util.*;

public class CountTheDigits {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int count = 0;
        while(number != 0){
            number /= 10;
            count++;
        }
        System.out.println(count);
        input.close();
    }
}
