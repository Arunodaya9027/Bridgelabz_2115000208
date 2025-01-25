import java.util.*;

public class AmarAkbarAnthony {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        int youngest = 0;
        int tallest = 0;

        for (int i = 0; i < 3; i++) {
            ages[i] = input.nextInt();
            heights[i] = input.nextDouble();
        }

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngest]) 
                youngest = i;
            if (heights[i] > heights[tallest]) 
                tallest = i;
        }

        System.out.printf("The youngest friend is %s with the age %d\n", friends[youngest], ages[youngest]);
        System.out.printf("The tallest friend is %s with the height %.2f\n", friends[tallest], heights[tallest]);
        input.close();
    }
}
