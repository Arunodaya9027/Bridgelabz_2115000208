import java.util.*;

public class DisplayEmployeeDetails {
    public static void main(String[] args) {
        String name, operation;
        int id;
        double salary;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        name = input.nextLine();
        System.out.print("Enter Employee ID: ");
        id = input.nextInt();
        System.out.print("Enter Yearly Salary: ");
        salary = input.nextDouble();
        
        Employee employee = new Employee(name, id, salary);
		System.out.println("Which Field you want to modify (Name, Id, Salary) ?");
		operation = input.next().toLowerCase();
		if(operation.equals("name")) {
            System.out.println("Enter Modified Employee Name: ");
            input.nextLine();
            employee.setName(input.nextLine());
		}
		else if(operation.equals("id")) {
			System.out.print("Enter Modified Employee Id: ");
			employee.setId(input.nextInt());
		} 
		else if(operation.equals("salary")) {
			System.out.print("Enter Modified Yearly Salary: ");
			employee.setSalary(input.nextDouble());
		} 
		else
			System.out.println("No Such Field Exists!");
		
        System.out.println("=== Employee Details ===");
        employee.display();
        input.close();
    }
}