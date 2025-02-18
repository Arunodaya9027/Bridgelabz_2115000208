import java.util.ArrayList;
import java.util.List;

abstract class JobRole {
    private String jobTitle;

    public JobRole(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {return jobTitle;}
    public abstract void displayJobRoleInfo();
}

class SoftwareEngineer extends JobRole {
    private String programmingLanguage;

    public SoftwareEngineer(String jobTitle, String programmingLanguage) {
        super(jobTitle);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayJobRoleInfo() {
        System.out.println("Software Engineer: " + getJobTitle() + " | Programming Language: " + programmingLanguage);
    }
}

class DataScientist extends JobRole {
    private String dataScienceTool;

    public DataScientist(String jobTitle, String dataScienceTool) {
        super(jobTitle);
        this.dataScienceTool = dataScienceTool;
    }

    @Override
    public void displayJobRoleInfo() {
        System.out.println("Data Scientist: " + getJobTitle() + " | Data Science Tool: " + dataScienceTool);
    }
}

class ProductManager extends JobRole {
    private String productDomain;

    public ProductManager(String jobTitle, String productDomain) {
        super(jobTitle);
        this.productDomain = productDomain;
    }

    @Override
    public void displayJobRoleInfo() {
        System.out.println("Product Manager: " + getJobTitle() + " | Product Domain: " + productDomain);
    }
}

class Resume<T extends JobRole> {
    private List<T> resumes = new ArrayList<>();

    public void addResume(T resume) {
        resumes.add(resume);
    }

    public List<T> getResumes() {return resumes;}
}

class ResumeUtility {
    public static void screenResumes(List<? extends JobRole> jobRoles) {
        for (JobRole jobRole : jobRoles) {
            jobRole.displayJobRoleInfo();
        }
    }
}

public class AIResumeGenerator {
    public static void main(String[] args) {
        SoftwareEngineer softwareEngineerResume = new SoftwareEngineer("Software Engineer", "Java");
        DataScientist dataScientistResume = new DataScientist("Data Scientist", "Python");
        ProductManager productManagerResume = new ProductManager("Product Manager", "E-commerce");

        Resume<JobRole> resume = new Resume<>();
        resume.addResume(softwareEngineerResume);
        resume.addResume(dataScientistResume);
        resume.addResume(productManagerResume);

        List<JobRole> jobRoles = resume.getResumes();
        System.out.println("---- All Resumes ----");
        ResumeUtility.screenResumes(jobRoles);
    }
}