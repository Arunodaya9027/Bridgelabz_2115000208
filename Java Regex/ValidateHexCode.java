import java.util.Scanner;
import java.util.regex.*;

public class ValidateHexCode {
    public static void main(String[] args) {
        String hexCode;
        String regex = "^#[0-9a-fA-F]{6}$";
        Pattern pattern = Pattern.compile(regex);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter hex code: ");
        hexCode = input.nextLine();

        Matcher matcher = pattern.matcher(hexCode);
        System.out.printf("Hex code '%s' is %s.", hexCode, (matcher.matches() ? "valid" : "invalid"));
        input.close();
    }
}
