import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class FindRepeatingWords {
    public static void main(String[] args) {
        String text;
        String regex = "\\b(\\w+)\\b\\s+\\b\\1\\b";
        Pattern pattern = Pattern.compile(regex);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        text = input.nextLine();

        Matcher matcher = pattern.matcher(text);
        List<String> repeatingWords = new ArrayList<String>();
        while (matcher.find()) 
            repeatingWords.add(matcher.group(1));
        
        System.out.print("Repeating words found: ");
        for (int i = 0; i < repeatingWords.size(); i++) {
            if (i == repeatingWords.size() - 1) 
                System.out.println(repeatingWords.get(i));
            else 
                System.out.print(repeatingWords.get(i) + ", ");
        }
        input.close();
    }
}
