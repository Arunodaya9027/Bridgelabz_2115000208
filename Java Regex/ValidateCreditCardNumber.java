import java.util.Scanner;
import java.util.regex.*;

public class ValidateCreditCardNumber {
    public static void main(String[] args) {
        String creditCardNumber;
        String regex = "^(?:(?<visa>4[0-9]{12}(?:[0-9]{3})?)|(?<mastercard>5[1-5][0-9]{14})|(?<discover>6(?:011|5[0-9]{2})[0-9]{12})|(?<amex>3[47][0-9]{13})|(?<diners>3(?:0[0-5]|[68][0-9])?[0-9]{11})|(?<jcb>(?:2131|1800|35[0-9]{3})[0-9]{11}))$";
        Pattern pattern = Pattern.compile(regex);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter credit card number: ");
        creditCardNumber = input.nextLine();
        
        Matcher matcher = pattern.matcher(creditCardNumber);
        System.out.printf("Credit card number is %s.", (matcher.matches() ? "valid" : "invalid"));
        input.close();
    }
}
