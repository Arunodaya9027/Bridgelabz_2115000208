import java.util.*;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count = 0;
        int temp = number;
        while(temp != 0){
            temp /= 10;
            count++;
        }

        int[] reverseDigits = new int[count];
        int index = 0;
        while (index != count) {
            reverseDigits[index++] = number % 10;
            number /= 10;
        }
        
        for (int i = 0; i < index; i++) 
            System.out.print(reverseDigits[i]);
        input.close();
    }
}
