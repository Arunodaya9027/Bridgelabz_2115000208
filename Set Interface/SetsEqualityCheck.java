import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class SetsEqualityCheck {
    private static boolean isEqual(Set<Integer> set1, Set<Integer> set2, int len1, int len2) {
        if(len1 != len2)
            return false;
        
        for(Integer num: set1)
            if(!set2.contains(num))
                return false;    
        return true;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Scanner input = new Scanner(System.in);

        int len1 = input.nextInt();
        int len2 = input.nextInt();
        for(int i=0; i<len1; i++)
            set1.add(input.nextInt());
            
        for(int i=0; i<len2; i++)
            set2.add(input.nextInt());

        System.out.println(set1);
        System.out.println(set2);
        System.out.println("Both Sets are " + ((isEqual(set1, set2, len1, len2)) ? "Equal" : "not equal"));
        input.close();
    }
}