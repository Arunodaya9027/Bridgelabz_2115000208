import java.lang.reflect.*;

class Student {
    private int rollNo;
    private String name;
    private double gpa;

    Student() {
        this.rollNo = 1;
        this.name = "arun";
        this.gpa = 7.99;
    }

    Student(int rollNo, String name, double gpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.gpa = gpa;
    }

    public int getRollNo() {return rollNo;}
    public String getName() {return name;}
    public double getGpa() {return gpa;}

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
    }
}

public class DynamicObjects {
    public static void main(String[] args) throws Exception {
        Class cls = Student.class;
        Constructor<?> constructor = cls.getConstructor(int.class, String.class, double.class);
        Object obj = constructor.newInstance(2, "arun", 8.99);
        Student student = (Student) obj;
        student.display();
    }
}
