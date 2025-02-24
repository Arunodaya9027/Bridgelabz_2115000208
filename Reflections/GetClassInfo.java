import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student {
    private int rollNo;
    private String name;
    private String gpa;
    
    Student() {
        this.rollNo = 1;
        this.name = "arun";
        this.gpa = "7.2";
    }

    Student(int rollNo, String name, String gpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.gpa = gpa;
    }

    public int getRollNo() {return rollNo;}
    public String getName() {return name;}
    public String getGpa() {return gpa;}

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
    }
}

public class GetClassInfo {
    public static void main(String[] args) {
        Class<?> cls = Student.class;
        System.out.println("Class Name: " + cls.getName());
        
        Field[] fields = cls.getDeclaredFields();
        System.out.println("Fields: ");
        for (Field field : fields) 
            System.out.println(field.getName());
        
        Method[] methods = cls.getDeclaredMethods();
        System.out.println("\nMethods: ");
        for (Method method : methods) 
            System.out.println(method.getName());
        
        Constructor<?>[] constructors = cls.getDeclaredConstructors();
        System.out.println("\nConstructors: ");
        for (Constructor<?> constructor : constructors) 
            System.out.println(constructor.getName());
    }
}