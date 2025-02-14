import java.util.*;

public class SortEmployeeIds {
    private static void sort(int[] arr, int len) {
        if(len <= 1)
            return;
        
        for(int i=1; i<len; i++) {
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }

    private static void display(int[] employeeIds) {
        for(int employeeId: employeeIds)
            System.out.print(employeeId + " ");
    }

    public static void main(String[] args) {
        int totalEmployees;
        Scanner input = new Scanner(System.in);
        totalEmployees = input.nextInt();
        int[] employeeIds = new int[totalEmployees];
        for(int i=0; i<totalEmployees; i++)
            employeeIds[i] = input.nextInt();
        
        System.out.println("Employee IDs Before Sorting: ");
        display(employeeIds);
        System.out.println();

        sort(employeeIds, totalEmployees);
        System.out.println("Employee IDs After Insertion Sort: ");
        display(employeeIds);
        input.close();
    }
}
