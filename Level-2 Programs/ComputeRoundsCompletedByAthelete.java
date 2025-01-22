import java.util.*;

public class ComputeRoundsCompletedByAthelete {
    public static void main(String[] args) {
        double side1, side2, side3;
        Scanner input = new Scanner(System.in);
        side1 = input.nextDouble();
        side2 = input.nextDouble();
        side3 = input.nextDouble();
        double perimeter = side1 + side2 + side3;
        double rounds = 5000/perimeter;         // Outputs Total Rounds needed in decimals
        double completedRounds = (int)Math.ceil(rounds);            // Converts Total Rounds needed to fully completed Rounds 
        System.out.printf("The total number of rounds the athlete will run is %.2f or approx %d to complete 5 km", rounds, completedRounds);
        input.close();
    }
}
