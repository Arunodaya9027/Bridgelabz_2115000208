import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class ExtractProgrammingLanguageNames {
    public static void main(String[] args) {
        String text;
        String regex = "\\b(?:Java|Python|C|C\\+\\+|C#|JavaScript|Ruby|Perl|PHP|Swift|Objective-C|Kotlin|Scala|Rust|Go|TypeScript|HTML|CSS)\\b";
        Pattern pattern = Pattern.compile(regex);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        text = input.nextLine();

        Matcher matcher = pattern.matcher(text);
        List<String> languages = new ArrayList<String>();
        while (matcher.find()) 
            languages.add(matcher.group());
        
        System.out.println("Programming languages found:");
        for (int i = 0; i < languages.size(); i++) {
            if (i == languages.size() - 1) 
                System.out.println(languages.get(i));
            else 
                System.out.print(languages.get(i) + ", ");
        }
        input.close();
    }
}
