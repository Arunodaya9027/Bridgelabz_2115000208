import java.util.*;

public class SubarraysWithZeroSum {
    private static ArrayList<int[]> zeroSum(int[] arr, int len) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<int[]> subArrayRange = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += arr[i];
            if (sum == 0)
                subArrayRange.add(new int[]{0, i});
            ArrayList<Integer> temp = new ArrayList<>();
            if (map.containsKey(sum)) {
                temp = map.get(sum);
                for (int j = 0; j < temp.size(); j++) 
                    subArrayRange.add(new int[]{temp.get(j)+1, i});
            }
            temp.add(i);
            map.put(sum, temp);
        }

        return subArrayRange;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++)
            arr[i] = input.nextInt();
        
        ArrayList<int[]> subArrayRange = zeroSum(arr, len);

        if (subArrayRange.size() == 0)
            System.out.println("No subarray exists");
        else {
            for (int i = 0; i < subArrayRange.size(); i++) {
                int[] range = subArrayRange.get(i);
                System.out.println("Subarray found from index " + range[0] + " to " + range[1]);
            }
        }
        input.close();
    }
}
