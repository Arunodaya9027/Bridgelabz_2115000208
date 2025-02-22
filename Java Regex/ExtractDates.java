import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class ExtractDates {
    public static void main(String[] args) {
        String text;
        String regex = "\\b\\d{1,2}/\\d{2}/\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        text = input.nextLine();

        Matcher matcher = pattern.matcher(text);
        List<String> dates = new ArrayList<String>();
        while (matcher.find()) 
            dates.add(matcher.group());
        
        System.out.print("Dates found: ");
        for (int i = 0; i < dates.size(); i++) {
            if (i == dates.size() - 1) 
                System.out.println(dates.get(i));
            else 
                System.out.print(dates.get(i) + ", ");
        }
        input.close();
    }
}
