import java.util.*;

public class RemoveDuplicatesFromString {
    public static String removeDuplicates(String str) {
        int len = str.length();
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<len; i++) {
            char ch = str.charAt(i);
            if(!set.contains(ch)) {
                sb.append(ch);
                set.add(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str, distintStr;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        System.out.println("Original String: " + str);
        distintStr = removeDuplicates(str);
        System.out.println("String After Duplicates Removal: " + distintStr);
        input.close();
    }
}
