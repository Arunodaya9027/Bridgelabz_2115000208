import java.util.*;
public class StudentVoteChecker {
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        } else if (age >= 18) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] age = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            age[i] = input.nextInt();
            if (canStudentVote(age[i])) {
                System.out.printf("Student %d can vote\n", i + 1);
            } else {
                System.out.printf("Student %d cannot vote\n", i + 1);
            }
        }
        input.close();
    }
}

