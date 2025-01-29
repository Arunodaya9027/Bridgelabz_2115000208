import java.util.*;

public class AnagramsString {
    private static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) 
            return false;

        int[] freq = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) 
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String str1, str2;
        boolean areAnagrams;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string:");
        str1 = input.nextLine();
        System.out.println("Enter the second string:");
        str2 = input.nextLine();
        areAnagrams = areAnagrams(str1, str2);
        if (areAnagrams) 
            System.out.println("The two strings are anagrams of each other");
        else 
            System.out.println("The two strings are not anagrams of each other");
        input.close();
    }
}