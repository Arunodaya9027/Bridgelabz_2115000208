import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    private static <T> Set<T> difference(Set<T> set1, Set<T> set2) {
        for(T num: set1) {
            if(!set2.contains(num))
                set2.add(num);
            else
                set2.remove(num);
        }
        return set2;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(3, 4, 5));
        System.out.println("Symmetric Difference of sets is " + difference(set1, set2));
    }
}
