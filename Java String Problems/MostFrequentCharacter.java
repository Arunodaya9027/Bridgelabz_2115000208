import java.util.*;

public class MostFrequentCharacter {
    private static char mostFrequentCharacter(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        int maxFreq = 0;
        char mostFrequentChar = ' ';
        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                mostFrequentChar = (char)i;
            }
        }
        return mostFrequentChar;
    }
    
    public static void main(String[] args) {
        String str;
        char mostFrequentChar;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string:");
        str = input.nextLine();
        mostFrequentChar = mostFrequentCharacter(str);
        System.out.printf("Most Frequent Character: '%c'", mostFrequentChar);
        input.close();
    }
}