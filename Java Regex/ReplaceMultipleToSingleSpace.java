import java.util.Scanner;

public class ReplaceMultipleToSingleSpace {
    public static void main(String[] args) {
        String text;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        text = input.nextLine();
        System.out.println("Original text: " + text);
        text = text.replaceAll("\\s+", " ");
        System.out.println("Text with multiple spaces replaced with single space: " + text);
        input.close();
    }
}