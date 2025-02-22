import java.util.Scanner;
import java.util.regex.*;

public class ValidateSSN {
    public static void main(String[] args) {
        String ssn;
        String regex = "^(?!000|666|9\\d\\d)\\d{3}-(?!00)\\d{2}-(?!0000)\\d{4}$";
        Pattern pattern = Pattern.compile(regex);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter SSN: ");
        ssn = input.nextLine();

        Matcher matcher = pattern.matcher(ssn);
        System.out.printf("SSN is %s.", (matcher.matches() ? "valid" : "invalid"));
        input.close();
    }
}
