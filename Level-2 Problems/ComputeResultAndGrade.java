import java.util.*;

public class ComputeResultAndGrade {
	public static void main(String[] args) {
		double physicsMarks, chemistryMarks, mathsMarks;
		Scanner input = new Scanner(System.in);
		physicsMarks = input.nextDouble();
		chemistryMarks = input.nextDouble();
		mathsMarks = input.nextDouble();
		double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
		double percentage = totalMarks / 300 * 100;
		
		if(percentage >= 80) {
			System.out.printf("Excellent! You got the A Grade with %.2f percent marks. \nRemarks: Level 4, above agency-normalized standards", percentage);
		}
		else if(percentage >= 70) {
			System.out.printf("Hurrah! You got the B Grade with %.2f percent marks. \nRemarks: Level 3, at agency-normalized standards", percentage);
		}
		else if(percentage >= 60) {
			System.out.printf("Good! You got the C Grade with %.2f percent marks. \nRemarks: Level 2, below, but approaching agency-normalized standards", percentage);
		}
		else if(percentage >= 50) {
			System.out.printf("You got the D Grade with %.2f percent marks. \nRemarks: Level 1, well below agency-normalized standards", percentage);
		}
		else if(percentage >= 40) {
			System.out.printf("You got the E Grade with %.2f percent marks. \nRemarks: Level 1-, too below agency-normalized standards", percentage);
		}
		else {
			System.out.printf("Sorry! You got the R Grade with %.2f percent marks. \nRemarks: Remedial Standards", percentage);
		}
		input.close();
	}
}
