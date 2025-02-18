import java.util.ArrayList;
import java.util.List;

abstract class CourseType {
    private String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public abstract void displayCourseInfo();
}

class ExamCourse extends CourseType {
    private String examDate;

    public ExamCourse(String courseName, String examDate) {
        super(courseName);
        this.examDate = examDate;
    }

    @Override
    public void displayCourseInfo() {
        System.out.println("Exam Course: " + getCourseName() + " | Exam Date: " + examDate);
    }
}

class AssignmentCourse extends CourseType {
    private String assignmentDate;

    public AssignmentCourse(String courseName, String assignmentDate) {
        super(courseName);
        this.assignmentDate = assignmentDate;
    }

    @Override
    public void displayCourseInfo() {
        System.out.println("Lab Course: " + getCourseName() + " | Assignment Date: " + assignmentDate);
    }
}

class ResearchCourse extends CourseType {
    private String researchTopic;
    private int courseDurationInMonths;

    public ResearchCourse(String courseName, String researchTopic, int courseDurationInMonths) {
        super(courseName);
        this.researchTopic = researchTopic;
        this.courseDurationInMonths = courseDurationInMonths;
    }

    @Override
    public void displayCourseInfo() {
        System.out.println("Research Course: " + getCourseName() + " | Research Topic: " + researchTopic + " | Duration: " + courseDurationInMonths + " months");
    }
}

class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getList() {
        return courses;
    }
}

class CourseUtility {
    public static void screenResumes(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.displayCourseInfo();
        }
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        ExamCourse examCourse = new ExamCourse("Java Programming", "12/12/2021");
        AssignmentCourse assignmentCourse = new AssignmentCourse("Data Structures", "12/15/2021");
        ResearchCourse researchCourse = new ResearchCourse("Machine Learning", "Deep Learning", 6);

        Course<CourseType> courseList = new Course<>();
        courseList.addCourse(examCourse);
        courseList.addCourse(assignmentCourse);
        courseList.addCourse(researchCourse);

        System.out.println("Courses =>");
        CourseUtility.screenResumes(courseList.getList());
    }
}