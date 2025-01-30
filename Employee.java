import java.util.*;

public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Yearly Salary: $" + salary);
    }
    
    public static void main(String[] args) {
        String name;
        int id;
        double salary;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        name = input.nextLine();
        System.out.print("\nEnter Employee ID: ");
        id = input.nextInt();
        System.out.print("\nEnter Yearly Salary: ");
        salary = input.nextDouble();
        
        Employee employee = new Employee(name, id, salary);
        System.out.println("=== Employee Details ===");
        employee.display();
        input.close();
    }
}