import java.util.*;

public class IsLeapYearInOneLine { 
	public static void main(String[] args) {
      int year;
      Scanner input = new Scanner(System.in);
      year = input.nextInt();
      if(year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 )) {
      	System.out.printf("%d is a Leap Year", year);
      }
      else {
 	     System.out.printf("%d is not a Leap Year", year);
		}
		input.close();
   }
}
