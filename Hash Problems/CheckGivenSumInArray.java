import java.util.*;

public class CheckGivenSumInArray {
    private static boolean checkGivenSum(int[] arr, int len, int target) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            if (set.contains(target - arr[i]))
                return true;
            set.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++)
            arr[i] = input.nextInt();
        int target = input.nextInt();

        System.out.println(checkGivenSum(arr, len, target));
        input.close();
    }
}
