import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

public class ExtractAllCapitalizedWords {
    public static void main(String[] args) {
        String text;
        String regex = "[A-Z][a-z]*";
        Pattern pattern = Pattern.compile(regex);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        text = input.nextLine();

        Matcher matcher = pattern.matcher(text);
        List<String> words = new ArrayList<String>();
        while (matcher.find()) 
            words.add(matcher.group());

        System.out.println("Capitalized words found:");
        for (int i = 0; i < words.size(); i++) {
            if (i == words.size() - 1) 
                System.out.println(words.get(i));
            else 
                System.out.print(words.get(i) + ", ");
        }
        input.close();
    }
}
