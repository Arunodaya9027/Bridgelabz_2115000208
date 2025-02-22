import java.util.Scanner;
import java.util.regex.*;

public class CensorBadWords {
    public static void main(String[] args) {
        String text;
        String regex = "\\b(?:damn|stupid|shit|hell|crap|idiot)\\b";
        Pattern pattern = Pattern.compile(regex);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        text = input.nextLine();

        Matcher matcher = pattern.matcher(text);
        System.out.println("Censored text:");
        System.out.println(matcher.replaceAll("****"));
        input.close();
    }
}
