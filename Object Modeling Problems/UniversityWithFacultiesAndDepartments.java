import java.util.ArrayList;

class Faculty {
    private String facultyId;
    private String facultyName;

    public Faculty(String facultyId, String facultyName) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
    }

    public void displayFaculties() {
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Faculty Name: " + facultyName);
    }
}

class Department {
    private String departmentId;
    private String departmentName;

    public Department(String departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public void displayDepartments() {
        System.out.println("Department ID: " + departmentId);
        System.out.println("Department Name: " + departmentName);
    }
}

class University {
    private String universityName;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;

    public University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<Department>();
        faculties = new ArrayList<Faculty>();
    }

    public void addDepartment(String departmentId, String departmentName) {
        Department department = new Department(departmentId, departmentName);
        this.departments.add(department);
    }

    public void addFaculty(Faculty faculty) {
        this.faculties.add(faculty);
    }

    public void display() {
        System.out.println("***********************************************");
        System.out.println("University Name: " + universityName);
        System.out.println("Departments:");
        System.out.println("***********************************************");
        for (Department department: departments) {
            department.displayDepartments();
            System.out.println();
        }

        System.out.println("***********************************************");
        for (Faculty faculty: faculties) {
            faculty.displayFaculties();
            System.out.println();
        }
    }

    public void deleteUniversity() {
        departments.clear();
        faculties.clear();
        System.out.println("University deleted");
    }
}

public class UniversityWithFacultiesAndDepartments {
    public static void main(String[] args) {
        University university = new University("GLA University");

        university.addDepartment("cea", "CEA Department");
        university.addDepartment("ec", "Electrical & Electronics Department");
        university.addDepartment("bac", "Business Administration Department");

        Faculty faculty1 = new Faculty("c01", "Rahul Kumar");
        Faculty faculty2 = new Faculty("c02", "Rahul Kumar");
        Faculty faculty3 = new Faculty("ec01", "Mohit Kumar");
        Faculty faculty4 = new Faculty("ec02", "Sheela Kumari");
        Faculty faculty5 = new Faculty("ba01", "Bhuvan Kumar");

        university.addFaculty(faculty1);
        university.addFaculty(faculty2);
        university.addFaculty(faculty3);
        university.addFaculty(faculty4);
        university.addFaculty(faculty5);

        System.out.println("Before university deletion");
        university.display();
        university.deleteUniversity();
        university = null;
        System.gc();
        System.out.println("After university deletion");
        university.display();

        System.out.println("Faculties: ");
        faculty1.displayFaculties();
        faculty2.displayFaculties();
    }
}
