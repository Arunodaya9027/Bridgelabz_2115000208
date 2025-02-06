import java.util.*;

class Student {
    private String studentId;
    private String name;
    private int age;
    private ArrayList<Course> courses;

    public Student(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.courses = new ArrayList<Course>();
    }

    public void enrollCourse(Course course) {
        if(!courses.contains(course)) 
            courses.add(course);
        else 
            System.out.println("Course Already Enrolled");
    }

    public void displayCourses() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Courses:");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}

class Professor {
    private String professorId;
    private String name;
    private ArrayList<Course> courses;

    public Professor(String professorId, String name) {
        this.professorId = professorId;
        this.name = name;
        this.courses = new ArrayList<Course>();
    }

    public void assignCourse(Course course) {
        if(!courses.contains(course)) 
            courses.add(course);
        else 
            System.out.println("Course Already Assigned");
    }

    public void displayCourses() {
        System.out.println("Professor ID: " + professorId);
        System.out.println("Courses:");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}

class Course {
    private String courseId;
    private String courseName;
    private Professor professor;
    private ArrayList<Student> students;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = new ArrayList<Student>();
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void enrollStudent(Student student) {
        if(!students.contains(student)) 
            students.add(student);
        else 
            System.out.println("Student Already Enrolled");
    }

    public String getCourseName() {
        return courseName;
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student student1 = new Student("1", "Alice", 20);
        Student student2 = new Student("2", "Bob", 21);

        Professor professor1 = new Professor("1", "Dr. Smith");
        Professor professor2 = new Professor("2", "Dr. Johnson");

        Course course1 = new Course("1", "Math 101");
        Course course2 = new Course("2", "Physics 101");

        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        professor1.assignCourse(course1);
        professor2.assignCourse(course2);

        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);

        course1.enrollStudent(student1);
        course1.enrollStudent(student2);

        student1.displayCourses();
        student2.displayCourses();

        professor1.displayCourses();
        professor2.displayCourses();
    }   
}
