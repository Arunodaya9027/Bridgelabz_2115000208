import java.util.regex.*;
import java.util.Scanner;

public class ValidateLicensePlateNumber {
    public static void main(String[] args) {
        String licensePlateNumber;
        String regex = "^[A-Z]{2}[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter license plate number: ");
        licensePlateNumber = input.nextLine();
        
        Matcher matcher = pattern.matcher(licensePlateNumber);
        System.out.printf("License plate number '%s' is %s.", licensePlateNumber, (matcher.matches() ? "valid" : "invalid"));
        input.close();
    }
}
