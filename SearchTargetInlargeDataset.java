public class SearchTargetInlargeDataset {
    private static void linearSearch(int[] arr, int search) {
        double start = System.nanoTime();
        for (int num: arr) 
            if (num == search) 
                break;
        
        double end = System.nanoTime();
        System.out.printf("Time taken by Linear Search Algorithm for Dataset size %d is %.4f ms\n", arr.length, (end - start)/1000000);
    }

    private static void binarySearch(int[] arr, int len, int search) {
        int left = 0, right = len - 1;
        double start = System.nanoTime();
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(mid < search) 
                left = mid + 1;
            else if(mid > search) 
                right = mid - 1;
            else 
                break;
        }
        double end = System.nanoTime();
        System.out.printf("Time taken by Binary Search Algorithm for Dataset size %d is %.4f ms\n", len, (end - start)/1000000);
    }

    public static void compare(int len) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) 
            arr[i] = i;
        int search = len - 100;

        linearSearch(arr, search);
        binarySearch(arr, len, search);
        System.out.println();
    }

    public static void main(String[] args) {
        compare(1000);
        compare(10000);
        compare(1000000);
    }
}