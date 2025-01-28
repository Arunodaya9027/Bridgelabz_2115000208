import java.util.*;

public class StudentsResult {
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++)
                scores[i][j] = (int) (Math.random() * 101);
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4];
        for (int i = 0; i < scores.length; i++) {
            results[i][0] = scores[i][0] + scores[i][1] + scores[i][2];
            results[i][1] = Math.round(results[i][0] / 3.0 * 100) / 100.0;
            results[i][2] = Math.round(results[i][0] / 300.0 * 10000) / 100.0;
            results[i][3] = results[i][2] >= 80 ? 'A' : results[i][2] >= 70 ? 'B' : results[i][2] >= 60 ? 'C' : results[i][2] >= 50 ? 'D' : results[i][2] >= 40 ? 'E' : 'R';
        }
        return results;
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\t%.2f\t%c\n", i + 1, scores[i][0], scores[i][1], scores[i][2], (int) results[i][0], results[i][1], results[i][2], (char) results[i][3]);
        }
    }

    public static void main(String[] args) {
        int students;
        Scanner input = new Scanner(System.in);
        students = input.nextInt();
        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
        input.close();
    }
}
