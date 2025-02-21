import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EfficientFileCopy {
    private static final int BUFFER_SIZE = 4096;
    public static double copyFileUsingUnbufferedStreams(String source, String destination) {
        double startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return (double)System.nanoTime() - startTime;
    }

    public static double copyFileUsingBufferedStreams(String source, String destination) {
        double startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return (double)System.nanoTime() - startTime;
    }
 
    public static void main(String[] args) {
        String sourceFile = "input.txt";
        String unbufferedCopy = "unbufferedCopy.txt";
        String bufferedCopy = "bufferedCopy.txt";
        
        double unbufferedTime = copyFileUsingUnbufferedStreams(sourceFile, unbufferedCopy);
        System.out.println("Unbuffered Copy Time: " + (unbufferedTime / 1000000) + " ms");

        double bufferedTime = copyFileUsingBufferedStreams(sourceFile, bufferedCopy);
        System.out.println("Buffered Copy Time: " + (bufferedTime / 1000000) + " ms");

        System.out.println("\nBuffered streams are approximately " +
                String.format("%.2f", (double) unbufferedTime / bufferedTime) + "x faster than unbuffered streams.");
    }
}
