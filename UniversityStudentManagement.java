class Student {
    protected static String universityName;
    private static int totalStudents = 0;
    private String name;
    private final String rollNumber;
    private String grade;

    Student() {
        this.name = "Anonymous";
        this.rollNumber = "R000";
        this.grade = "Unknown";
        totalStudents++;
    }

    Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    
    public static void displayTotalStudents() {
        System.out.println("Total Students in " + universityName + ": " + totalStudents);
    }

    public void display() {
        if(this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Student Roll Number: " + rollNumber);
            System.out.println("Student Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        Student.universityName = "GLA University";
        Student student1 = new Student("Varun Kumar", "U101", "A+");
        student1.display();
        Student student2 = new Student("Arpit Jain", "U102", "A");
        student2.display();
        Student student3 = new Student("Arpit Mishra", "U103", "A+");
        student3.display();
        Student.displayTotalStudents();
    }
}
