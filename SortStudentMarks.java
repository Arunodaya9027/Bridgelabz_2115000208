import java.util.*;

public class SortStudentMarks {
    private static void bubbleSort(int[] arr, int totalStudents) {
        if(totalStudents <= 1)
            return;

        for(int i=0; i<totalStudents; i++) {
            boolean isSwapped = true;
            for(int j=0; j<totalStudents-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!isSwapped)
                break;
        }
    }

    private static void display(int[] studentsMarks) {
        for(int studentsMark: studentsMarks)
            System.out.print(studentsMark + " ");
    }

    public static void main(String[] args) {
        int totalStudents;
        Scanner input = new Scanner(System.in);
        totalStudents = input.nextInt();
        int[] studentsMarks = new int[totalStudents];
        for(int i=0; i<totalStudents; i++)
            studentsMarks[i] = input.nextInt();

        System.out.println("Student Marks Before Sorting: ");
        display(studentsMarks);
        System.out.println();

        bubbleSort(studentsMarks, totalStudents);
        System.out.println("Student Marks After Bubble Sort: ");
        display(studentsMarks);
        input.close();
    }
}