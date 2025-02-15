import java.util.*;

public class FirstNegativeNumber {
    public static int firstNegative(int[] arr, int len) {
        for(int i=0; i<len; i++)
            if(arr[i] < 0)
                return i;
        return -1;
    }
    
    public static void main(String[] args) {
        int len;
        Scanner input = new Scanner(System.in);
        len = input.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) 
            arr[i] = input.nextInt();
        
        int index = firstNegative(arr, len);
        if(index == -1)
            System.out.println("No negative number found");
        else
            System.out.println("First negative number found at index " + index);
        input.close();
    }
}
