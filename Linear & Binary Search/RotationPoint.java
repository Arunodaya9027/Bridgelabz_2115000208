import java.util.*;

public class RotationPoint {
    private static int minimum(int[] arr, int len) {
        int left = 0, right = len-1;
        while (left < right) {
            int mid = (left + right) / 2;
            if(arr[mid] > arr[right]) 
                left = mid + 1;
            else if(arr[mid] < arr[right])
                right = mid;
        }
        return left;
    }

    public static void main(String[] args) {
        int len;
        Scanner input = new Scanner(System.in);
        len = input.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++)
            arr[i] = input.nextInt();
        
        int index = minimum(arr, len);
        System.out.println("The smallest element in Rotated Sorted array is at index " + index);
        input.close();
    }
}
