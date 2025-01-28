import java.util.*;

public class CompareStrings {
    public static boolean compare(String str1, String str2) {
        if (str1.length() != str2.length()) 
            return false;

        for (int i = 0; i < str1.length(); i++) 
            if (str1.charAt(i) != str2.charAt(i)) 
                return false;
        return true;
    }

    public static void main(String[] args) {
        String str1, str2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first & second string respectively: ");
        str1 = input.nextLine();
        str2 = input.nextLine();

        boolean charAtResult = compare(str1, str2);
        boolean equalsResult = str1.equals(str2);
        System.out.printf("Using charAt() method: %b\n", charAtResult);
        System.out.printf("Using equals() method: %b\n", equalsResult);
        input.close();
    }
}