import java.util.HashSet;
import java.util.Set;

public class SetUnionAndIntersection {
    private static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> unionSet = new HashSet<>();
        for(Integer num: set1)
            unionSet.add(num);
        for(Integer num: set2)
            unionSet.add(num);
        
        return unionSet;
    }

    private static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersectionSet = new HashSet<>();
        for(Integer num: set1)
            if(set2.contains(num))
                intersectionSet.add(num);
        
        return intersectionSet;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(3, 4, 5);

        System.out.println("Union of sets is " + union(set1, set2));
        System.out.println("Intersetion of sets is " + intersection(set1, set2));
    }
}
