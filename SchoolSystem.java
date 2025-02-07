class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        checkAge(this.age);
    }

    private void checkAge(int age) {
        if (age < 0 || age > 100) 
            throw new IllegalArgumentException("Invalid age");
    }

    public void display() {
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        super.display();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        super.display();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        super.display();
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Jaswanth Mishra", 35, "Mathematics");
        teacher.displayRole();

        Student student = new Student("Alicia", 15, "10th");
        student.displayRole();

        Staff staff = new Staff("Bhushan Chauhan", 25, "Administration");
        staff.displayRole();
    }
}
