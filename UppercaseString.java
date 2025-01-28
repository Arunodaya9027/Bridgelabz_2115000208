import java.util.*;

public class UppercaseString {
    public static String getUpperCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') 
                result += (char)(ch - 32);
            else 
                result += ch;
        }
        return result;
    }

    public static boolean compare(String str1, String str2) {
        if (str1.length() != str2.length()) 
            return false;

        for (int i = 0; i < str1.length(); i++) 
            if (str1.charAt(i) != str2.charAt(i)) 
                return false;
        return true;
    }

    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();

        String upperCaseResult = getUpperCase(str);
        String toUpperCaseResult = str.toUpperCase();
        boolean compareResult = compare(upperCaseResult, toUpperCaseResult);
        System.out.printf("Using getUpperCase() method: %s\n", upperCaseResult);
        System.out.printf("Using toUpperCase() method: %s\n", toUpperCaseResult);
        System.out.printf("Are result strings equal? %b\n", compareResult);
        input.close();
    }
}
