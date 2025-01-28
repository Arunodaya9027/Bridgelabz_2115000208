import java.util.*;

public class EuclideanDistance {
    public static double findDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findEquation(int x1, int y1, int x2, int y2) {
        double m = (double) (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[] { m, b };
    }

    public static void main(String[] args) {
        int x1, y1, x2, y2;
        Scanner input = new Scanner(System.in);
        x1 = input.nextInt();
        y1 = input.nextInt();
        x2 = input.nextInt();
        y2 = input.nextInt();
        double distance = findDistance(x1, y1, x2, y2);
        System.out.printf("The Euclidean distance between the points (%d, %d) and (%d, %d) is %.2f\n", x1, y1, x2, y2, distance);
        double[] equation = findEquation(x1, y1, x2, y2);
        System.out.printf("The equation of the line passing through the points (%d, %d) and (%d, %d) is y = %.2fx + %.2f\n", x1, y1, x2, y2, equation[0], equation[1]);
        input.close();
    }
}
