import java.util.*;

public class RemoveDuplicatesFromString {
    private static String removeDuplicates(String str) {
        String modifiedStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (modifiedStr.indexOf(ch) == -1) 
                modifiedStr += ch;
        }
        return modifiedStr;
    }
    
    public static void main(String[] args) {
        String str, modifiedString;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        modifiedString = removeDuplicates(str);
        System.out.printf("After removing duplicates from \"%s\", the modified string is \"%s\"", str, modifiedString);
        input.close();
    }
}
