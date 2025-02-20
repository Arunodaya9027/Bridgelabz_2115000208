import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesInOrder {
        public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> seen = new HashSet<>();
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (seen.add(item)) {
                result.add(item);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(5);

        System.out.println("Original List: " + arrayList);
        System.out.println("List after removing duplicates: " + removeDuplicates(arrayList));
    }
}
