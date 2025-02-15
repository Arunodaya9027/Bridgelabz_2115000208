import java.util.*;

public class ConcatenateString {
    private static String concatenate(String[] strings) {
        StringBuffer sb = new StringBuffer();
        for(String str: strings) {
            sb.append(str);
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Total Strings going to pass: ");
        int totalStrings = input.nextInt();
        input.nextLine();

        String[] strings = new String[totalStrings];
        for(int i=0; i<totalStrings; i++) 
            strings[i] = input.nextLine();
        
        String concatenatedStr = concatenate(strings);
        System.out.println("Final String after Concatenation: " + concatenatedStr);
        input.close();
    }
}
