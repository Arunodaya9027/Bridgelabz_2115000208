import java.util.*;

public class Quadratic {
    public static double[] findRoots(double a, double b, double c) {
        double[] roots = new double[2];
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            roots[0] = (-b + Math.sqrt(delta)) / (2 * a);
            roots[1] = (-b - Math.sqrt(delta)) / (2 * a);
        } 
		else if (delta == 0)
            roots[0] = -b / (2 * a);
        return roots;
    }

    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        double[] roots = findRoots(a, b, c);
        if (roots.length == 2)
            System.out.printf("The roots of the equation are %.2f and %.2f\n", roots[0], roots[1]);
        else if (roots.length == 1)
            System.out.printf("The root of the equation is %.2f\n", roots[0]);
        else
            System.out.println("The equation has no real roots");
        input.close();
    }
}

