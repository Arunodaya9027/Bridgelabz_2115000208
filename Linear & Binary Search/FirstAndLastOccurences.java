import java.util.*;

public class FirstAndLastOccurences {
    private static int firstOccurence(int[] arr, int len, int target) {
        int left = 0, right = len-1;
        while(left < right) {
            int mid = (left + right) / 2;
            if(arr[mid] < target)
                left = mid + 1;
            else if(arr[mid] == target) 
                return mid;
            else
                right = mid;
        }
        return -1;
    }

    private static int lastOccurence(int[] arr, int len, int target) {
        int left = 0, right = len-1;
        while(left < right) {
            int mid = (left + right + 1) / 2;
            if(arr[mid] > target)
                right = mid - 1;
            else if(arr[mid] == target) 
                return mid;
            else
                left = mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int len, target;
        Scanner input = new Scanner(System.in);
        len = input.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++)
            arr[i] = input.nextInt();
        target = input.nextInt();

        int first = firstOccurence(arr, len, target);
        int last = lastOccurence(arr, len, target);
        System.out.println((first != -1) ? "First Occurence of " + target + " is at index " + first : "Element Occurrences not found");
        System.out.println((last != -1) ? "Last Occurence of " + target + " is at index " + last : "Element Occurrences not found");
        input.close();
    }
}
