class Patient {
    static String hospitalName;
    static int totalPatients = 0;
    private String name;
    private int age;
    private String ailment;
    private final String patientId;

    Patient() {
        this.name = "Anonymous";
        this.age = 0;
        this.ailment = "Unknown";
        this.patientId = "P000";
        totalPatients++;
    }

    Patient(String name, int age, String ailment) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientId = "P" + (totalPatients + 101);
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients in " + hospitalName + ": " + totalPatients);
    }

    public void display() {
        if(this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientId);
            System.out.println("Patient Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient.hospitalName = "Nayati Medicity";
        Patient patient1 = new Patient("Swati Kumari", 25, "Hair-line Fracture");
        patient1.display();
        Patient patient2 = new Patient("Agamya Shrivastav", 30, "Flu");
        patient2.display();
        Patient patient3 = new Patient("Tanmay Mishra", 35, "TB");
        patient3.display();
        Patient.getTotalPatients();
        Patient patient4 = new Patient();
        patient4.display();
    }
}
