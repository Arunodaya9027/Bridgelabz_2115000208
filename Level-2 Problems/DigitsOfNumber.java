import java.util.*;

public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
            if (index == maxDigit) {
                break;
            }
        }

        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
            else if (digits[i] > secondLargest) 
                secondLargest = digits[i];
        }
        System.out.printf("Largest digit: %d\nSecond largest digit: %d", largest, secondLargest);
        input.close();
    }
}
