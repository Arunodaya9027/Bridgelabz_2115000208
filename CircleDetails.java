class Circle {
    private double radius;
    
    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }
    
    public double calculateArea() {
        return Math.PI * getRadius() * getRadius();
    }
    
    public double calculateCircumference() {
        return 2 * Math.PI * getRadius();
    }

    public void display() {
        System.out.println("Radius: " + getRadius());
        System.out.println("Circumference: " + calculateCircumference());
        System.out.println("Area: " + calculateArea());
    }
}

public class  CircleDetails {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.display();
        System.out.println();
        Circle circle2 = new Circle(5.0);
        circle2.display();
    }
}