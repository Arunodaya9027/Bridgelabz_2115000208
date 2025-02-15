import java.io.*;
import java.util.*;

public class CountWordOccurrence {
    public static void main(String[] args) {
        String wordToFind;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word to find: ");
        wordToFind = input.nextLine();
        int count = 0;

        try {
            FileReader fileReader = new FileReader("input.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\s+"); 
                for (String word : words) 
                    if (word.equalsIgnoreCase(wordToFind)) 
                        count++;
            }

            bufferedReader.close();
            System.out.println("Word '" + wordToFind + "' appears " + count + " times.");
        }
		catch (IOException e) {
            e.printStackTrace();
        }
        input.close();
    }
}
