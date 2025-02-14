import java.util.*;

public class SortExamScores {
    private static void sort(int[] examScores, int totalStudents) {
        for (int i = 0; i < totalStudents - 1; i++) {
            int min = i;
            for(int j=i+1; j<totalStudents; j++) {
                if(examScores[j] < examScores[min]) 
                    min = j;
            }

            int temp = examScores[min];
            examScores[min] = examScores[i];
            examScores[i] = temp;
        }
    }

    private static void display(int[] examScores) {
        for(int examScore: examScores)
            System.out.print(examScore + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int totalStudents;
        Scanner input = new Scanner(System.in);
        totalStudents = input.nextInt();
        int[] examScores = new int[totalStudents];
        for(int i=0; i<totalStudents; i++)
            examScores[i] = input.nextInt();
        
        System.out.println("Exam Scores before Sorting:");
        display(examScores);

        sort(examScores, totalStudents);

        System.out.println("Exam Scores after Selection Sort:");
        display(examScores);
        input.close();
    }
}
