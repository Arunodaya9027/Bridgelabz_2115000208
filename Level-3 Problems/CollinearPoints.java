import java.util.*;

public class CollinearPoints {
    public static boolean areCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    public static boolean areCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        int x1, y1, x2, y2, x3, y3;
        Scanner input = new Scanner(System.in);
        x1 = input.nextInt();
        y1 = input.nextInt();
        x2 = input.nextInt();
        y2 = input.nextInt();
        x3 = input.nextInt();
        y3 = input.nextInt();
        boolean areCollinearUsingSlope = areCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        System.out.printf("The points (%d, %d), (%d, %d), and (%d, %d) are %s collinear using slope\n", x1, y1, x2, y2, x3, y3, areCollinearUsingSlope ? "" : "not");
        boolean areCollinearUsingArea = areCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        System.out.printf("The points (%d, %d), (%d, %d), and (%d, %d) are %s collinear using area\n", x1, y1, x2, y2, x3, y3, areCollinearUsingArea ? "" : "not");
        input.close();
    }
}
