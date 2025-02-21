import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadWriteToTextFile {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("input.txt");
            FileOutputStream fos = new FileOutputStream("output.txt")) {
            int byteData;
            while((byteData = fis.read()) != -1) 
                fos.write(byteData);
            System.out.println("File copied successfully");

        }

        catch(FileNotFoundException e) {
            System.out.println("'input.txt' File not found: " + e.getMessage());
        }

        catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
