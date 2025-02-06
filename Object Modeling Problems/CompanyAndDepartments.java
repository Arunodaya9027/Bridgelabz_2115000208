import java.util.*;

class Company {
    private String companyName;
    private String companyAddress;
    private ArrayList<Department> departments;

    public Company(String companyName, String companyAddress) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.departments = new ArrayList<Department>();
    }

    public Department getDepartment(int index) {
        return departments.get(index);
    }

    public void addDepartment(String departmentId, String departmentName) {
        this.departments.add(new Department(departmentId, departmentName));
    }

    public void companyInfo() {
        System.out.println("***********************************************");
        System.out.println("***********************************************");
        System.out.println("Company Name: " + companyName);
        System.out.println("Company Address: " + companyAddress);
        System.out.println("***********************************************");
        System.out.println("***********************************************");
        for(Department department: departments)
            department.displayDepartments();
        System.out.println("***********************************************");
    }
}

class Department {
    private String departmentId;
    private String departmentName;
    private ArrayList<Employee> employees;

    public Department(String departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.employees = new ArrayList<Employee>();
    }

    public void joiningEmployee(String employeeId, String employeeName, double salaryPerMonth) {
        this.employees.add(new Employee(employeeName, employeeId, salaryPerMonth));
    }

    public void displayDepartments() {
        System.out.println("***********************************************");
        System.out.println("Department ID: " + departmentId);
        System.out.println("Department Name: " + departmentName);
        System.out.println("***********************************************");
        for(Employee employee: employees) {
            employee.display();
            System.out.println();
        }
    }
}

class Employee {
    private String name;
    private final String employeeId;
    private double salaryPerMonth;

    public Employee(String name, String employeeId, double salaryPerMonth) {
        this.name = name;
        this.employeeId = employeeId;
        this.salaryPerMonth = salaryPerMonth;
    }

    public void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary Per Month: " + salaryPerMonth);
    }
}

public class CompanyAndDepartments {
    public static void main(String[] args) {
        Company company1 = new Company("Geetanjali Housing State", "123-H, Amber Street, Indore");
        Company company2 = new Company("Stack Solutions", "Sector-68, Noida");

        company1.addDepartment("GH02", "Sales");
        company1.addDepartment("GH01", "IT");
        company2.addDepartment("SA01", "Educators");
        company2.addDepartment("SA02", "IT");
        
        company1.getDepartment(0).joiningEmployee("GHE001", "Naresh Kumar", 45000);
        company1.getDepartment(0).joiningEmployee("GHE002", "Rahul Kumar", 45000);
        company1.getDepartment(1).joiningEmployee("GHE101", "Vishnu Pandey", 55000);
        company1.getDepartment(1).joiningEmployee("GHE102", "Vishesh", 60000);
        company2.getDepartment(0).joiningEmployee("SE001", "Om Datt Tripathi", 85000);
        company2.getDepartment(0).joiningEmployee("SE002", "Monu Bhaiya", 100000);
        company2.getDepartment(1).joiningEmployee("SE101", "Aditya Pratap", 85000);

        company1.companyInfo();
        company2.companyInfo();

        company1 = null;
        System.gc();
        System.out.println("Company 1 deleted Successfully");
        company1.companyInfo();
    }
}
