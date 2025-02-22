import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

public class ExtractLinks {
    public static void main(String[] args) {
        String text;
        String regex = "https?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(/\\S*)?";
        Pattern pattern = Pattern.compile(regex);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        text = input.nextLine();

        Matcher matcher = pattern.matcher(text);
        List<String> links = new ArrayList<String>();
        while (matcher.find()) 
            links.add(matcher.group());
        
        System.out.print("Links found: ");
        for (int i = 0; i < links.size(); i++) {
            if (i == links.size() - 1) 
                System.out.println(links.get(i));
            else 
                System.out.print(links.get(i) + ", ");
        }
        input.close();
    }
}
