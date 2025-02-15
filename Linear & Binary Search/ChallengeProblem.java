import java.util.*;

public class ChallengeProblem {
    private static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] <= n) {
                int pos = arr[i] - 1;
                if (arr[pos] != arr[i]) {
                    int temp = arr[pos];
                    arr[pos] = arr[i];
                    arr[i] = temp;
                    i--;
                }
            }
        }
        
        for (int i = 0; i < n; i++) 
            if (arr[i] != i + 1) 
                return i + 1;
        return n + 1;
    }

    private static int search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) 
                return mid;
            else if (arr[mid] < target) 
                left = mid + 1;
            else 
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int len, target;
        Scanner input = new Scanner(System.in);
        len = input.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++)
            arr[i] = input.nextInt();
        target = input.nextInt();

        int missing = firstMissingPositive(arr);
        int index = search(arr, target);
        System.out.println("First Missing Positive Integer: " + missing);
        System.out.println("Index of Target Number: " + index);
        input.close();
    }
}
