import java.util.*;
public class TypeOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) 
            nums[i] = input.nextInt();

        for (int num: nums) {
            if (num > 0) {
                if (num % 2 == 0) 
                    System.out.printf("%d is a positive even number\n", num);
                else
                    System.out.printf("%d is a positive odd number\n", num);
            } 
            else if (num < 0) 
                System.out.printf("%d is a negative number\n", num);
            else 
                System.out.printf("%d is zero\n", num);
        }

        if (nums[0] == nums[4]) 
            System.out.println("First and last numbers are Equal!");
        else if (nums[0] > nums[4]) 
            System.out.println("First number is greater than last number.");
        else 
            System.out.println("First number is less than last number.");
        input.close();
    }
}
