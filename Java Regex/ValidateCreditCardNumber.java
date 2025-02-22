import java.util.Scanner;
import java.util.regex.*;

public class ValidateCreditCardNumber {
    public static void main(String[] args) {
        String visaRegex = "^4\\d{15}$";
        String masterCardRegex = "^5\\d{15}$";
        Pattern visaPattern = Pattern.compile(visaRegex);
        Pattern masterCardPattern = Pattern.compile(masterCardRegex);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter credit card number: ");
        String creditCardNumber = input.nextLine();
        
        Matcher visaMatcher = visaPattern.matcher(creditCardNumber);
        Matcher masterCardMatcher = masterCardPattern.matcher(creditCardNumber);
        System.out.printf("Credit card number is %s.", (visaMatcher.matches() || masterCardMatcher.matches() ? "valid" : "invalid"));
        input.close();
    }
}
