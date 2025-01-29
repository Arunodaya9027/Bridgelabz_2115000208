import java.util.*;

public class ReplaceWordInString {
    private static String replaceWord(String str, String wordToReplace, String newWord) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.equals(wordToReplace)) 
                sb.append(newWord).append(" ");
            else 
                sb.append(word).append(" ");
        }
        return sb.toString().trim();
    }
    
    public static void main(String[] args) {
        String str, wordToReplace, newWord, modifiedString;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        System.out.println("Enter the word to replace and new word respectively:");
        wordToReplace = input.next();
        newWord = input.next();
        modifiedString = replaceWord(str, wordToReplace, newWord);
        System.out.printf("Modified String: \"%s\"", modifiedString);
        input.close();
    }
}