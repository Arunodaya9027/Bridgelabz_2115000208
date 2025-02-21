import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;

class Employee  implements Serializable {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {return id;}
    public String getName() {return name;}
    public String getDepartment() {return department;}
    public double getSalary() {return salary;}
}

public class ObjectSerialization {
    public static void serializeObject(String filename) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            Employee employee1 = new Employee(1, "John Doe", "IT", 50000);
            Employee employee2 = new Employee(2, "Jane Doe", "HR", 60000);
            oos.writeObject(employee1);
            oos.writeObject(employee2);
            System.out.println("Employee object serialized successfully");
        }
        catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void deserializeObject(String filename) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Employee employee1 = (Employee) ois.readObject();
            Employee employee2 = (Employee) ois.readObject();
            System.out.println("Employee 1: " + employee1.getName() + " works in " + employee1.getDepartment() + " department");
            System.out.println("Employee 2: " + employee2.getName() + " works in " + employee2.getDepartment() + " department");
        }
        catch(IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filename = "employee.ser";
        serializeObject(filename);
        deserializeObject(filename);
    }
}
