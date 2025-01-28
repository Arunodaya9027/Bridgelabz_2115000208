import java.util.*;

public class TrigonometricFunctions {
    public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {
        double angle;
		Scanner input = new Scanner(System.in);
		angle = input.nextDouble();
		TrigonometricFunctions tf = new TrigonometricFunctions();
        double[] result = tf.calculateTrigonometricFunctions(angle);
        System.out.printf("Sine: %.4f", result[0]);
        System.out.printf("Cosine: %.4f", result[1]);
        System.out.printf("Tangent: %.4f", result[2]);
		input.close();
    }
}
