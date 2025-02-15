import java.util.*;

public class PeakElementInArray {
    private static int peakElement(int[] arr, int len) {
        int left = 0, right = len-1;
        while(left < right) {
            int mid = (left + (right - left)) / 2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])
                return arr[mid];
            else if(arr[mid] < arr[mid-1])
                right = mid-1;
            else if(arr[mid] < arr[mid+1])
                left = mid+1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int len;
        Scanner input = new Scanner(System.in);
        len = input.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++)
            arr[i] = input.nextInt();
        
        int peak = peakElement(arr, len);
        System.out.println("Peak Element in Array is " + peak);
        input.close();
    }    
}
