import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class ExtractCurrencyValues {
    public static void main(String[] args) {
        String text;
        String regex = "\\$\\d+(?:\\.\\d{2})?";
        Pattern pattern = Pattern.compile(regex);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        text = input.nextLine();

        Matcher matcher = pattern.matcher(text);
        List<String> currencies = new ArrayList<String>();
        while (matcher.find()) 
            currencies.add(matcher.group());

        System.out.print("Currency values found: ");
        for (int i = 0; i < currencies.size(); i++) {
            if (i == currencies.size() - 1) 
                System.out.println(currencies.get(i));
            else 
                System.out.print(currencies.get(i) + ", ");
        }
        input.close();
    }
}
