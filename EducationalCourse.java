class Course {
    private String courseName;
    private int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }

    public void displayInfo() {
        System.out.println();
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " days");
    }
}

class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public String getPlatform() {
        return platform;
    }

    public boolean getIsRecorded() {
        return isRecorded;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getFee() {
        return fee;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
    }
}


public class EducationalCourse {
    public static void main(String[] args) {
        Course course = new Course("Java Programming", 40);
        course.displayInfo();

        OnlineCourse onlineCourse = new OnlineCourse("Development Using C#", 45, "Udemy", true);
        onlineCourse.displayInfo();

        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Web Development Using MERN Stack", 60, "Coursera", false, 20000.0, 20.0);
        paidOnlineCourse.displayInfo();
    }
}