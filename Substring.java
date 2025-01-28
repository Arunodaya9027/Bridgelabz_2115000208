import java.util.*;

public class Substring {
    public static String getSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) 
            result += str.charAt(i);
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
        int start, end;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        System.out.println("Enter the start & end index: ");
        start = input.nextInt();
        end = input.nextInt();

        String charAtResult = getSubstring(str, start, end);
        String substringResult = str.substring(start, end);
        boolean compareResult = compare(charAtResult, substringResult);
        System.out.printf("Using charAt() method: %s\n", charAtResult);
        System.out.printf("Using substring() method: %s\n", substringResult);
        System.out.printf("Are the substrings equal? %b\n", compareResult);
        input.close();
    }    
}
