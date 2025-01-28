import java.util.*;

public class AmarAkbarAnthony {
    public static int findYoungest(int[] age) {
        int min = age[0];
        for (int i = 1; i < age.length; i++) {
            if (age[i] < min) {
                min = age[i];
            }
        }
        return min;
    }

    public static double findTallest(double[] height) {
        double max = height[0];
        for (int i = 1; i < height.length; i++) {
            if (height[i] > max) 
                max = height[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] age = new int[3];
        double[] height = new double[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            age[i] = input.nextInt();
            height[i] = input.nextDouble();
        }

        System.out.printf("The youngest friend is %d years old\n", findYoungest(age));
        System.out.printf("The tallest friend is %.2f cm tall\n", findTallest(height));
        input.close();
    }
}

