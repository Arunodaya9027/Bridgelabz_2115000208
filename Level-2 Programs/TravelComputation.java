import java.util.*;

public class TravelComputation {
    public static void main(String[] args) {
        String name, fromCity, viaCity, toCity;
        double distanceFromToVia, distanceViaToFinalCity;
        int timeFromToVia, timeViaToFinalCity;
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        fromCity = input.nextLine();
        viaCity = input.nextLine();
        toCity = input.nextLine();
        distanceFromToVia = input.nextDouble();
        distanceViaToFinalCity = input.nextDouble();
        timeFromToVia = input.nextInt();
        timeViaToFinalCity = input.nextInt();
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.printf("The Total Distance travelled by %s from %s to %s via %s is %.2f km and the Total Time taken is %d minutes%n", name, fromCity, toCity, viaCity, totalDistance, totalTime);
        input.close();
    }
}
