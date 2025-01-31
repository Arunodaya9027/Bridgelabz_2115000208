public class Circle {
    private double radius;
    
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