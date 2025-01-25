import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] multiplicationTable = new int[10];
        
        for (int i = 1; i <= 10; i++) 
            multiplicationTable[i - 1] = number * i;
        
        for (int i = 1; i <= 10; i++) 
            System.out.printf("%d * %d = %d\n", number, i, multiplicationTable[i-1]);
        
        input.close();
    }
}
