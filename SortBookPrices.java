import java.util.*;

class Sort {
    public void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right-left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) 
            leftArr[i] = arr[left+i];
        for (int i = 0; i < n2; i++) 
            rightArr[i] = arr[mid+1+i];


        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j])
                arr[k++] = leftArr[i++];
            else 
                arr[k++] = rightArr[j++];
        }
        
        while (i < n1) 
            arr[k++] = leftArr[i++];
        while (j < n2) 
            arr[k++] = rightArr[j++];
    
    }
}

public class SortBookPrices {
    private static void display(int[] bookPrices) {
        for (int bookPrice: bookPrices) 
            System.out.print(bookPrice + " ");
    }
    
    public static void main(String[] args) {
        int totalBooks;
        Scanner input = new Scanner(System.in);
        totalBooks = input.nextInt();
        int[] bookPrices = new int[totalBooks];
        for(int i=0; i<totalBooks; i++)
            bookPrices[i] = input.nextInt();
        
        System.out.println("Book Prices before Sorting: ");
        display(bookPrices);
        System.out.println();

        Sort sort = new Sort();
        sort.mergeSort(bookPrices, 0, totalBooks-1);

        System.out.println("Book Prices After Merge Sort: ");
        display(bookPrices);
        input.close();
    }
}
