import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

class Student {
    private int rollNumber;
    private String name;
    private double gpa;

    public Student(int rollNumber, String name, double gpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}

public class StoreAndRetriveData {
    public static List<Student> consoleInput() {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<Student> students = new ArrayList<>();
            boolean flag = true;
            while(flag){
                System.out.print("Enter your age: ");
                String rollNo = reader.readLine();

                System.out.print("Enter your name: ");
                String name = reader.readLine();
                
                System.out.print("Enter your GPA: ");
                String gpa = reader.readLine();
                Student student = new Student(Integer.parseInt(rollNo), name, Double.parseDouble(gpa));
                students.add(student);
                System.out.println("Want to add more student details? (yes/no)");
                String choice = reader.readLine();
                if(choice.equalsIgnoreCase("no"))
                    flag = false;
            }
            
            return students;
        }
        catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    public static void storeDetails(String fileName, List<Student> details) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            for(Student student: details){
                dos.writeInt(student.getRollNumber());
                dos.writeUTF(student.getName());
                dos.writeDouble(student.getGpa());
            }
            System.out.println("Data stored successfully.");
        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());
        }
    }

    public static void retriveDetails(String fileName) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            while(dis.available() > 0){
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        String fileName = "student.dat";
        List<Student> details = consoleInput();
        storeDetails(fileName, details);
        retriveDetails(fileName);
    }
}