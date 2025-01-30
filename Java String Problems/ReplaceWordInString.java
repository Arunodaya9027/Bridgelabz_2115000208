import java.util.*;

public class ReplaceWordInString {
    private static String replaceWord(String str, String wordToReplace, String newWord) {
        return str.replace(wordToReplace, newWord);
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