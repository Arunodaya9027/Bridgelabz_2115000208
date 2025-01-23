import java.util.*;

public class MultipleOfANumber {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        for(int i = 100; i >= 1; i--){
            if(i % number == 0){
                System.out.println(i);
            }
        }
        input.close();
    }
}
