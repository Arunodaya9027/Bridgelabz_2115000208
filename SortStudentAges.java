import java.util.*;

class CountingSort {
    private static int findMax(int[] studentAges) {
        int max = studentAges[0];
        for(int age: studentAges) 
            if(max < age)
                max = age;
        
        return max;
    }

    public int[] sort(int[] studentAges, int totalStudents) {
        int[] out = new int[totalStudents];
        int max = findMax(studentAges);
        int[] count = new int[max + 1];

        for(int i=0; i<=max; i++)
            count[i] = 0;
        
        for(int j=0; j<totalStudents; j++) 
            count[studentAges[j]]++;
        
        for(int i=1; i<=max; i++)
            count[i] += count[i-1];
        
        for(int j=totalStudents-1; j>=0; j--) {
            out[count[studentAges[j]]-1] = studentAges[j];
            count[studentAges[j]]--;
        }

        return out;
    }
}

public class SortStudentAges {
    private static void display(int[] studentAges) {
        for(int studentAge: studentAges)
            System.out.print(studentAge + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int totalStudents;
        Scanner input = new Scanner(System.in);
        totalStudents = input.nextInt();
        int[] studentAges = new int[totalStudents];

        for(int i=0; i<totalStudents; i++)
            studentAges[i] = input.nextInt();
        
        System.out.println("Age of Group of Students before Sorting:");
        display(studentAges);

        CountingSort countingSort = new CountingSort();
        int[] sortedStudentAges = countingSort.sort(studentAges, totalStudents);

        System.out.println("Age of Group of Students after Counting Sort:");
        display(sortedStudentAges);
        input.close();
    }
}
