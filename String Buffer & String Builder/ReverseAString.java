import java.util.*;

public class ReverseAString {
    private static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String str, reversedStr;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        System.out.println("Original String: " + str);
        reversedStr = reverse(str);
        System.out.println("Reversed String: " + reversedStr);
        input.close();
    }    
}
