import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        for(int i = 6; i <= 9; i++){
            System.out.printf("%d * %d = %d\n", number, i, number * i);
        }
        input.close();
    }
}