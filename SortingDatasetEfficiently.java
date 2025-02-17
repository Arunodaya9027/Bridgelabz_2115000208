public class SortingDatasetEfficiently {
    private static void bubbleSort(int[] arr, int len) {
        double start = System.nanoTime();
        for (int i=0; i < len-1; i++) 
            for (int j=0; j < len-i-1; j++) 
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        double end = System.nanoTime();
        System.out.printf("Time taken by Bubble Sort Algorithm is %.4f ms\n", (end - start)/1000000);
    }

    private static void mergeSort(int[] arr, int len) {
        double start = System.nanoTime();
        mergeSort(arr, 0, len - 1);
        double end = System.nanoTime();
        System.out.printf("Time taken by Merge Sort Algorithm is %.4f ms\n", (end - start)/1000000);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) 
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) 
            R[j] = arr[mid + 1 + j];
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) 
            if (L[i] <= R[j]) 
                arr[k++] = L[i++];
            else 
                arr[k++] = R[j++];
        while (i < n1) 
            arr[k++] = L[i++];
        while (j < n2) 
            arr[k++] = R[j++];   
    }

    private static void quickSort(int[] arr, int len) {
        double start = System.nanoTime();
        quickSort(arr, 0, len - 1);
        double end = System.nanoTime();
        System.out.printf("Time taken by Quick Sort Algorithm is %.4f ms\n", (end - start)/1000000);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = pivot(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int pivot(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) 
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void compare(int len) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) 
            arr[i] = (int)(Math.random() * 1000);
        
        System.out.printf("For Dataset Size = %d:\n", len);
        bubbleSort(arr.clone(), len);
        mergeSort(arr.clone(), len);
        quickSort(arr.clone(), len);
        System.out.println();
    }

    public static void main(String[] args) {
        compare(1000);
        compare(10000);
        compare(1000000);
    }
}