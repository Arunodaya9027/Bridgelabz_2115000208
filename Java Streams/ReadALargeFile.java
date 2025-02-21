import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadALargeFile {
    public static void main(String[] args) {
        String filename = "input.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while((line = reader.readLine()) != null) {
                if(line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        }
        catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}