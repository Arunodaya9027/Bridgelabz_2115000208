import java.util.*;

public class WeightConversionPoundToKilogram {
    public static void main(String[] args) {
        double weight;
        Scanner input = new Scanner(System.in);
        weight = input.nextDouble();
        double weightInKg = weight/2.2;
        System.out.printf("The weight of the person in pound is %.2f and in kg is %.2f", weight, weightInKg);
        input.close();
    }
}
