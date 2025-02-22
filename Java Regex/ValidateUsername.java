import java.util.Scanner;
import java.util.regex.*;

public class ValidateUsername {
    public static void main(String[] args) {
        String text;
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        Pattern pattern = Pattern.compile(regex);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        text = input.nextLine();
        
        Matcher matcher = pattern.matcher(text);
        System.out.printf("Your Social Security Number(SSN) is %s.", (matcher.matches() ? "valid" : "invalid"));
        input.close();
    }
}