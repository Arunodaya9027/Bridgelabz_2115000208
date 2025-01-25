import java.util.*;

public class CanVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int TOTAL_STUDENTS = 10;
        int[] ages = new int[TOTAL_STUDENTS];
        for (int i = 0; i < TOTAL_STUDENTS; i++)
            ages[i] = input.nextInt();

        for (int age: ages) {
            if (age < 0) 
                System.err.println("Invalid age");
            else if (age >= 18)
                System.out.printf("The student with the age %d can vote.\n", age);
            else
                System.out.printf("The student with the age %d cannot vote.\n", age);
        }
        input.close();
    }
}