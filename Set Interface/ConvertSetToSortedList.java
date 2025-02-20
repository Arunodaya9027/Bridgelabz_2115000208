import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ConvertSetToSortedList {
    private static <T extends Comparable<? super T>> List<T> toSortedList(Set<T> set) {
        List<T> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);
        return sortedList;
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);
        set.add(9654);
        set.add(54);
        set.add(42);
        set.add(7986);
        set.add(91);
        System.out.println("Given Set is " + set);
        System.out.println("Sorted List of Given Set is " + toSortedList(set));
    }
}
