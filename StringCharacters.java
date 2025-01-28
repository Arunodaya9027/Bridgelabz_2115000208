import java.util.*;

public class StringCharacters {
    public static char[] getCharacters(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) 
            result[i] = str.charAt(i);
        return result;
    }

    public static boolean compare(char[] charArray, char[] toCharArrayResult) {
        if (charArray.length != toCharArrayResult.length) 
            return false;

        for (int i = 0; i < charArray.length; i++) 
            if (charArray[i] != toCharArrayResult[i]) 
                return false;
        return true;
    }

    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();

        char[] charArray = getCharacters(str);
        char[] toCharArrayResult = str.toCharArray();
        boolean compareResult = compare(charArray, toCharArrayResult);
        System.out.printf("Using getCharacters() method: %s\n", Arrays.toString(charArray));
        System.out.printf("Using toCharArray() method: %s\n", Arrays.toString(toCharArrayResult));
        System.out.printf("Are the arrays equal? %b\n", compareResult);
        input.close();
    }    
}
