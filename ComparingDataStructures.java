import java.util.*;

public class ComparingDataStructures {
    private static void array(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) 
            arr[i] = i;
        
        double start = System.nanoTime();
        for (int i = 0; i < size; i++) 
            if (arr[i] == size - 1) break;
        double end = System.nanoTime();
        System.out.printf("Time taken by Array for search is %.4f ms\n", (end - start)/1000000);
    }

    private static void hashSet(int size) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < size; i++) 
            hashSet.add(i);
        
        double start = System.nanoTime();
        hashSet.contains(size - 1);
        double end = System.nanoTime();
        System.out.printf("Time taken by HashSet for search is %.4f ms\n", (end - start)/1000000);
    }

    private static void treeSet(int size) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < size; i++) 
            treeSet.add(i);
        
        double start = System.nanoTime();
        treeSet.contains(size - 1);
        double end = System.nanoTime();
        System.out.printf("Time taken by TreeSet for search is %.4f ms\n", (end - start)/1000000);
    }

    public static void compare(int size) {
        System.out.printf("For Dataset Size %d:\n", size);
        array(size);
        hashSet(size);
        treeSet(size);
        System.out.println();
    }

    public static void main(String[] args) {
        compare(1000);
        compare(10000);
        compare(1000000);
    }
}