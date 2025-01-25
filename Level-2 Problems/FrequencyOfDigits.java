import java.util.*;

public class FrequencyOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count = 0;
        int temp = number;
        while(temp != 0){
            temp /= 10;
            count++;
        }

        int[] digits = new int[count];
        int index = 0;
        while (index != count) {
            digits[index++] = number % 10;
            number /= 10;
        }

        int[] frequency = new int[10];
        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }

        for (int i = 0; i < 10; i++) {
            if (frequency[i] != 0) {
                System.out.printf("Frequency of %d: %d\n", i, frequency[i]);
            }
        }
        input.close();
    }
}
