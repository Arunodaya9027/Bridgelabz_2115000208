import java.util.*;

public class Circle {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Circumference: " + calculateCircumference());
        System.out.println("Area: " + calculateArea());
    }
    
    public static void main(String[] args) {
        double radius;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        radius = input.nextDouble();
        
        Circle circle = new Circle(radius);
        circle.display();
        input.close();
    }
}