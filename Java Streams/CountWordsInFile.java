import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class CountWordsInFile {
    public static Map<String, Integer> countWordsInFile(String filename) {
        Map<String, Integer> wordCount = new HashMap<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for(String word : words) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        }
        catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return wordCount;
    }

    public static PriorityQueue<Map.Entry<String, Integer>> sortWordsByFrequency(Map<String, Integer> wordCount) {
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
            (a, b) -> a.getValue() == b.getValue() ? a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue()
        );
        pq.addAll(wordCount.entrySet());
        return pq;
    }

    public static void displayTopWords(PriorityQueue<Map.Entry<String, Integer>> pq, int k) {
        for(int i = 0; i < k; i++) {
            Map.Entry<String, Integer> entry = pq.poll();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String filename = "input.txt";
        Map<String, Integer> wordCount = countWordsInFile(filename);
        PriorityQueue<Map.Entry<String, Integer>> priorityQueue = sortWordsByFrequency(wordCount);
        displayTopWords(priorityQueue, 5);
    }
}