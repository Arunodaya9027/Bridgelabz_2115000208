import java.util.*;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] heights = new double[11];
        double sumOfHeights = 0;
        
        for (int i = 0; i < 11; i++) {
            heights[i] = input.nextDouble();
            sumOfHeights += heights[i];
        }
        
        double mean = sumOfHeights / 11;
        System.out.println(mean);
        input.close();
    }
}
