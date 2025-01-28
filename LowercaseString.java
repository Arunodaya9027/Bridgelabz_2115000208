import java.util.*;

public class LowercaseString {
    public static String getLowerCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') 
                result += (char)(ch + 32);
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

        String lowerCaseResult = getLowerCase(str);
        String toLowerCaseResult = str.toLowerCase();
        boolean compareResult = compare(lowerCaseResult, toLowerCaseResult);
        System.out.printf("Using getLowerCase() method: %s\n", lowerCaseResult);
        System.out.printf("Using toLowerCase() method: %s\n", toLowerCaseResult);
        System.out.printf("Are result strings equal? %b\n", compareResult);
        input.close();
    }
}
