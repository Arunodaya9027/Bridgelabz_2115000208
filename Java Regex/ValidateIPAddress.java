import java.util.Scanner;
import java.util.regex.*;

public class ValidateIPAddress {
    public static void main(String[] args) {
        String ipAddress;
        String regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        Pattern pattern = Pattern.compile(regex);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter IP address: ");
        ipAddress = input.nextLine();

        Matcher matcher = pattern.matcher(ipAddress);
        System.out.printf("IP address is %s.", (matcher.matches() ? "valid" : "invalid"));
        input.close();
    }
}
