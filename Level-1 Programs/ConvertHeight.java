import java.util.*;

public class ConvertHeight {
    public static void main(String[] args) {
		double height;
        Scanner input = new Scanner(System.in);
        height = input.nextDouble();       // height in cm taken as input
        double inches = height / 2.54;			// height in inches
        double feet = inches / 12;			// height in feet 
        System.out.println("Your Height in cm is " + height + " while in feet is " + feet + " and inches is " + inches);
        input.close();
    }
}
