import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.util.List;
import java.io.IOException;

public class UserInputFromConsole {
    public static List<String> consoleInput() {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();
            
            System.out.print("Enter your favourite programming language: ");
            String language = reader.readLine();
            
            System.out.println("Hello, " + name);
            System.out.println();
            return List.of(name, age, language);
        }
        catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    public static void writeToFile(String filename, List<String> details) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Name: "+ details.get(0) +"\n");
            writer.write("Age: "+ details.get(1) +"\n");
            writer.write("Favourite Programming Language: " + details.get(2) + "\n");
        }
        catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void displayFileContents(String filename) {
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filename = "user.txt";
        List<String> details = consoleInput();
        writeToFile(filename, details);
        displayFileContents(filename);
    }
}
