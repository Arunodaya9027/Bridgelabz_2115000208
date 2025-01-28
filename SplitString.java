import java.util.*;

public class SplitString {
    public static int countWords(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) 
            if (str.charAt(i) == ' ') 
                count++;
        return count + 1;
    }

    public static String[] splitString(String str) {
        String[] words = new String[countWords(str)];
        int wordCount = 0;
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                words[wordCount++] = word;
                word = "";
            } else 
                word += ch;
        }
        words[wordCount] = word;
        return words;
    }

    public static int[] getLengths(String[] words) {
        int[] lengths = new int[words.length];
        for (int i = 0; i < words.length; i++) 
            lengths[i] = words[i].length();
        return lengths;
    }

    public static String[][] getWordLengths(String[] words, int[] lengths) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(lengths[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = input.nextLine();

        String[] words = splitString(str);
        int[] lengths = getLengths(words);
        String[][] result = getWordLengths(words, lengths);
        System.out.println("Word\t\tLength");
        for (int i = 0; i < result.length; i++) 
            System.out.printf("%s\t\t%d\n", result[i][0], Integer.parseInt(result[i][1]));
        input.close();
    }
}
