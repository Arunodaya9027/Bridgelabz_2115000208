import java.util.*;

public class IsALeapYear {
	public static void main(String[] args) {
		int year;
		Scanner input = new Scanner(System.in);
		year = input.nextInt();
		if(year >= 1582) {
			if(year % 4 == 0) {
				if(year % 100 == 0) {
					if(year % 400 == 0) {
						System.out.printf("%d is a Leap Year", year);
					}
					else
						System.out.printf("%d is not a Leap Year", year);
				}
				else
					System.out.printf("%d is a Leap Year", year);
			}
			else 
	         System.out.printf("%d is not a Leap Year", year);
		}
		else
	      System.out.printf("%d is not a Leap Year", year);
		input.close();
	}
}
