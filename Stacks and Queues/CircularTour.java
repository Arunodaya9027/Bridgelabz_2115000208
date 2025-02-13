import java.util.Queue;
import java.util.*;

public class CircularTour {

    private static int startingPoint(Queue<int[]> queue, int totalStations) {
        int totalPetrol = 0, totalDistance = 0;
        int start = 0, petrolLeft = 0;
        List<int[]> stations = new ArrayList<>(queue);

        for (int i = 0; i < totalStations; i++) {
            totalPetrol += stations.get(i)[0];
            totalDistance += stations.get(i)[1];
        }

        if (totalPetrol < totalDistance) 
            return -1;

        for (int i = 0; i < totalStations; i++) {
            petrolLeft += stations.get(i)[0] - stations.get(i)[1];

            if (petrolLeft < 0) {
                start = i + 1;
                petrolLeft = 0;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalStations = input.nextInt();
        Queue<int[]> queue = new LinkedList<int[]>();

        for (int i = 0; i < totalStations; i++) {
            System.out.println("Station " + (char)(i+65));
            int petrol = input.nextInt();
            int distance = input.nextInt();
            queue.add(new int[]{petrol, distance});
        }
        input.close();

        int startPoint = startingPoint(queue, totalStations);
        System.out.printf("Starting from Station %s, we cover whole circular track", (char)(startPoint+65));
    }
}
