import java.util.*;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year >= 1582) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        year = input.nextInt();

        if (isLeapYear(year))
            System.out.printf("The year %d is a Leap Year", year);
        else 
            System.out.printf("The year %d is not a Leap Year", year);
        input.close();
    }
}
