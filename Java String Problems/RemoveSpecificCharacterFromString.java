import java.util.*;

public class RemoveSpecificCharacterFromString {
    private static String removeCharacter(String str, char ch) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) 
                result += str.charAt(i);
        }
        return result;
    }
    
    public static void main(String[] args) {
        String str, modifiedString;
        char ch;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        ch = input.next().charAt(0);
        modifiedString = removeCharacter(str, ch);
        System.out.printf("Modified String: \"%s\"", modifiedString);
        input.close();
    }
}