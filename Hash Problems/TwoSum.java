import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                result[0] = map.get(diff);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int len;
        Scanner input = new Scanner(System.in);
        System.out.println("Size of array: ");
        len = input.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println("Target sum: ");
        int target = input.nextInt();
        int[] result = twoSum(nums, target);
        System.out.println("The indices are: " + result[0] + " " + result[1]);
        input.close();
    }
}
