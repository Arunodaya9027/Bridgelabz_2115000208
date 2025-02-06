import java.util.*;

class Student {
    private String rollNumber;
    private String studentName;
    private School school;
    private ArrayList<Course> courses;

    public Student(String rollNumber, String studentName, School school) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.school = school;
        this.courses = new ArrayList<Course>();
        this.school.admittedStudents(this);
    }

    public void enrolledInCourse(Course course) {
        this.courses.add(course);
        course.enrolledStudents(this);
    }

    public void displayEnrolledCourse () {
        System.out.println("School Name: " + school.getSchoolName());
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Student Name: " + studentName);
        System.out.println("Courses Enrolled:");
        for (Course course : courses) {
            course.display();
            System.out.println();
        }
    }

    public void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Student Name: " + studentName);
        System.out.println();
    }
}

class Course {
    private String courseId;
    private String courseName;
    private ArrayList<Student> students;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = new ArrayList<Student>();
    }

    public void enrolledStudents(Student student) {
        this.students.add(student);
    }

    public void displayEnrolledStudents() {
        System.out.println("Course Id: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Students Enrolled:");
        for (Student student : students) {
            student.display();
            System.out.println();
        }
    }

    public void display() {
        System.out.println("Course Id: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println();
    }
}

class School {
    private String schoolName;
    private ArrayList<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<Student>();
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void admittedStudents(Student student) {
        this.students.add(student);
    }

    public void displayStudents() {
        System.out.println("School Name: " + schoolName);
        System.out.println("Students Admitted:");
        for (Student student : students) {
            student.display();
            System.out.println();
        }
    }
}

public class SchoolAndStudentWithCourses {
    public static void main(String[] args) {
        School school = new School("City School");

        Student student1 = new Student("101", "Jitesh", school);
        Student student2 = new Student("102", "Dev", school);
        Student student3 = new Student("103", "Anmol", school);

        Course course1 = new Course("C1", "Maths");
        Course course2 = new Course("C2", "Physics");
        Course course3 = new Course("C3", "Computer Science");

        student1.enrolledInCourse(course1);
        student1.enrolledInCourse(course2);
        student2.enrolledInCourse(course2);
        student2.enrolledInCourse(course3);
        student3.enrolledInCourse(course1);
        student3.enrolledInCourse(course3);

        school.displayStudents();

        course1.displayEnrolledStudents();
        course2.displayEnrolledStudents();
        course3.displayEnrolledStudents();

        student1.displayEnrolledCourse();
        student2.displayEnrolledCourse();
        student3.displayEnrolledCourse();
    }
}
