import static java.lang.Math.*; // Static import

class StaticImportExample {
    public static void main(String[] args) {
        double radius = 5.0;
        double area = PI * pow(radius, 2); // Using Math library methods directly

        System.out.println("The area of a circle with radius " + radius + " is: " + area);
    }
}