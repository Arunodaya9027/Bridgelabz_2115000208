import java.util.*;

public class RemoveSpecificCharacterFromString {
    private static String removeCharacter(String str, char ch) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
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