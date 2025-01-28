import java.util.*;

public class DisplayCalender {
    private static String[] months = { "January", "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December" };
    private static int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    
    public static String getMonthName(int month) {
        return months[month - 1];
    }

    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year))
            return 29;
        return days[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static int getFirstDay(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + 31 * m0 / 12) % 7;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month and year: ");
        int month = input.nextInt();
        int year = input.nextInt();
        int firstDay = getFirstDay(month, year);

        System.out.println(getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDay; i++)
            System.out.print("    ");
        for (int i = 1; i <= getDaysInMonth(month, year); i++) {
            System.out.printf("%3d ", i);
            if ((i + firstDay) % 7 == 0)
                System.out.println();
        }
        input.close();
    }
}
