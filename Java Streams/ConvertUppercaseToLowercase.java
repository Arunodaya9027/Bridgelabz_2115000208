import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConvertUppercaseToLowercase {
    public static void main(String[] args) {
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            int ch;
            while ((ch = reader.read()) != -1) {
                char character = (char) ch;
                if (Character.isUpperCase(character)) 
                    character = Character.toLowerCase(character);
                writer.write(character);
            }
            System.out.println("File converted successfully.");
        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());
        }
    }
}