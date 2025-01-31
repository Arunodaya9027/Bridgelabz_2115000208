import java.util.*;

public class ComputeCircle {
    public static void main(String[] args) {
        String operation;
        double radius;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        radius = input.nextDouble();
        
        Circle circle = new Circle(radius);
		System.out.println("Enter 'Y' if you want to modify Radius");
		operation = input.next().toLowerCase();
		if(operation.equals("Y")) {
			System.out.print("Enter Modified Radius of Circle: ");
			circle.setRadius(input.nextDouble());
		}
		else
			System.out.println("OK");
		
        System.out.println("=== Cicle Details ===");
        circle.display();
        input.close();
    }
}