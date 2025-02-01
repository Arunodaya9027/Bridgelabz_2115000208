class Course {
    private String courseName;
    private double duration;
    private double fee;
    private static String instituteName;

    public Course() {
        this.courseName = "Anonymous Course";
        this.duration = 0.0;
        this.fee = 0.0;
    }

    public Course(String courseName, double duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}

public class OnlineCourseManagement {
    public static void main(String[] args) {
        Course.updateInstituteName("ABC Institute");
        Course course1 = new Course("Basics of Java Programming", 73.0, 300.0);
        course1.displayCourseDetails();
        System.out.println();
        Course course2 = new Course("C# Advanced: Making Professional Softwares Using .NET", 170.0, 200.0);
        course2.displayCourseDetails();
    }
}