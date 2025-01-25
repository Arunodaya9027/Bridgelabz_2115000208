import java.util.*;

public class StudentsResultModified {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        int[][] marks = new int[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the marks of student " + (i + 1) + " in physics, chemistry, and maths: ");
            int physics = input.nextInt();
            int chemistry = input.nextInt();
            int maths = input.nextInt();
            if (physics < 0 || chemistry < 0 || maths < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--;
                continue;
            }
            marks[i][0] = physics;
            marks[i][1] = chemistry;
            marks[i][2] = maths;
        }

        for (int i = 0; i < numberOfStudents; i++) {
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            if (percentages[i] >= 80) 
                grades[i] = 'A';
            else if (percentages[i] >= 70 && percentages[i] <= 79) 
                grades[i] = 'B';
            else if (percentages[i] >= 60 && percentages[i] <= 69) 
                grades[i] = 'C';
            else if (percentages[i] >= 50 && percentages[i] <= 59) 
                grades[i] = 'D';
            else if (percentages[i] >= 40 && percentages[i] <= 49) 
                grades[i] = 'E';
            else 
                grades[i] = 'R';
        }
        System.out.println("Physics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < numberOfStudents; i++) 
            System.out.printf("%d\t%d\t%d\t%.2f\t%c\n", marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        input.close();
    }
}
