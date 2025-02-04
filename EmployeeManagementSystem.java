class Employee {
    protected static String companyName;
    private String name;
    private final String id;
    private String designation;
    private static int totalEmployees = 0;

    Employee() {
        this.name = "Anonymous";
        this.id = "Ed000";
        this.designation = "Unknown";
        totalEmployees++;
    }

    Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees in " + companyName + ": " + totalEmployees);
    }

    public void display() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Designation: " + designation);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee.companyName = "Capgemini";
        Employee employee1 = new Employee("Naman Kumar", "E101", "Software Engineer");
        if(employee1 instanceof Employee)
            employee1.display();
        Employee employee2 = new Employee("Chritij Jain", "E102", "Software Engineer");
        if(employee2 instanceof Employee)
            employee2.display();
        Employee employee3 = new Employee("Vaishali", "E103", "Software Engineer");
        if(employee3 instanceof Employee)
            employee3.display();
        Employee employee4 = new Employee();
        if(employee4 instanceof Employee)
            employee4.display();
        Employee.displayTotalEmployees();
    }
}
