import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class RotateList {
    public static <T> void rotateList(List<T> list, int k) {
        int n = list.size();
        k = k % n; 
        reverse(list, 0, k - 1);
        reverse(list, k, n - 1);
        reverse(list, 0, n - 1);
    }

    
    private static <T> void reverse(List<T> list, int start, int end) {
        while (start < end) {
            T temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("Original List: " + arrayList);
        rotateList(arrayList, 2);
        System.out.println("Rotated List: " + arrayList);
        
        List<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("grapes");
        linkedList.add("mango");

        System.out.println("\nOriginal LinkedList: " + linkedList);
        rotateList(linkedList, -2);
        System.out.println("Rotated LinkedList: " + linkedList);
    }
}
