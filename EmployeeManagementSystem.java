import java.util.*;

abstract class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;

    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getEmployeeId() {return employeeId;}
    public String getName() {return name;}
    public double getBaseSalary() {return baseSalary;}

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();
    public void displayDetails() {
        System.out.println();
        System.out.println("Employee Id: " + getEmployeeId());
        System.out.println("Employee Name: " + getName());
        System.out.println("Salary: " + getBaseSalary());
    }
}

interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private double hourlyRate = 120;
    private double hoursWorked;
    private String department;

    public FullTimeEmployee(String employeeId, String name, double baseSalary, double hoursWorked) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        setBaseSalary(calculateSalary());
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + this.hourlyRate * this.hoursWorked;
    }

    @Override
    public String getDepartmentDetails() {
        return this.department;
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Department: " + getDepartmentDetails());
    }
}

class PartTimeEmployee extends Employee implements Department {
    private double hourlyRate = 50;
    private double hoursWorked;
    private String department;

    public PartTimeEmployee(String employeeId, String name, double baseSalary, double hoursWorked) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        setBaseSalary(calculateSalary());
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + this.hourlyRate * this.hoursWorked;
    }

    @Override
    public String getDepartmentDetails() {
        return this.department;
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Department: " + getDepartmentDetails());
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("FT001", "Anmol", 50000, 70));
        employees.add(new PartTimeEmployee("PT001", "Jessie", 10000, 100));

        for (Employee employee : employees) {
            if (employee instanceof Department) 
                ((Department) employee).assignDepartment(employee instanceof FullTimeEmployee ? "HR" : "IT");
            employee.displayDetails();
        }
    }
}