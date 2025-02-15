import java.util.*;

public class SearchSpecificWordInSentence {
    private static String search(String[] strings, String word) {
        for(String str: strings) {
            String[] arrayOfStr = str.split(" ");
            for(int j=0; j<arrayOfStr.length; j++)
                if(arrayOfStr[j].equals(word))
                    return str;
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Total Strings going to pass: ");
        int totalStrings = input.nextInt();
        input.nextLine();

        String[] strings = new String[totalStrings];
        for(int i=0; i<totalStrings; i++) 
            strings[i] = input.nextLine();

        String word = input.next();
        String str = search(strings, word);
        System.out.println((str.equals("")) ? "Not found" : str);
        input.close();
    }
}
