import java.util.regex.*;
import java.util.Scanner;

public class ExtractAllEmails {
    public static void main(String[] args) {
        String text;
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";;
        Pattern pattern = Pattern.compile(regex);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        text = input.nextLine();

        Matcher matcher = pattern.matcher(text);
        System.out.println("Emails found:");
        while (matcher.find()) 
            System.out.println(matcher.group());
        input.close();
    }
}
