import java.io.*;

public class LargeFileReading {
    public static void compare(int size) {
        String path = "largefile.txt";
        createFile(path, size);

        System.out.printf("For File Size = %dMB:\n", size);
        performanceFileReader(path);
        performanceInputStreamReader(path);
        System.out.println();
    }

    private static void createFile(String path, int size) {
        try {
            FileWriter writer = new FileWriter(path);
            for (int i = 0; i < size * 1048576; i++) 
                writer.write("a");
            writer.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void performanceFileReader(String path) {
        double start = System.nanoTime();
        try {
            FileReader reader = new FileReader(path);
            int ch;
            while ((ch = reader.read()) != -1);
            reader.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        
        double end = System.nanoTime();
        System.out.printf("Time taken by FileReader is %.4f ms\n", (end - start)/1000000);
    }

    private static void performanceInputStreamReader(String path) {
        double start = System.nanoTime();
        try {
            FileInputStream fis = new FileInputStream(path);
            InputStreamReader reader = new InputStreamReader(fis);
            int ch;
            while ((ch = reader.read()) != -1);
            reader.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        double end = System.nanoTime();
        System.out.printf("Time taken by InputStreamReader is %.4f ms\n", (end - start)/1000000);
    }

    public static void main(String[] args) {
        compare(1);
        compare(100);
        compare(500);
    }
}