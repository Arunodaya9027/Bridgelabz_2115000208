import java.util.*;

public class LongestConsecutiveSubsequence {
    private static int longestSubsequence(int[] arr, int len) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < len; i++)
            set.add(arr[i]);
        
        int longest = 0;
        for (int i = 0; i < len; i++) {
            if (!set.contains(arr[i] - 1)) {
                int current = arr[i];
                int count = 1;
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++)
            arr[i] = input.nextInt();
        
        System.out.println(longestSubsequence(arr, len));
        input.close();
    }
}
