import java.io.FileInputStream;
import java.io.IOException;

public class ConvertImageToByteArray {
    public static byte[] convertImageToByteArray(String imagePath) {
        try (FileInputStream fis = new FileInputStream(imagePath)) {
            byte[] imageBytes = new byte[fis.available()];
            fis.read(imageBytes);
            return imageBytes;
        } 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) {
        String imagePath = "image.jpg";
        byte[] imageBytes = convertImageToByteArray(imagePath);
        System.out.println("Image converted to byte array: " + imageBytes);
    }
}
