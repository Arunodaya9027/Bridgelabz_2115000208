import java.util.*;

class Hospital{
    private String hospitalName;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<Doctor>();
        this.patients = new ArrayList<Patient>();
    }

    public void addDoctor(Doctor doctor) {
        if(!doctors.contains(doctor)) 
            doctors.add(doctor);
        else 
            System.out.println("Doctor Already There");
    }

    public void addPatient(Patient patient) {
        if(!patients.contains(patient)) 
            patients.add(patient);
        else 
            System.out.println("Patient Already There");
    }

    public void display() {
        System.out.println(hospitalName);
        System.out.println("Hospital Data");
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            doctor.displayPatients();
            System.out.println();
        }
        System.out.println("Patients:");
        for (Patient patient : patients) {
            patient.displayDoctors();
            System.out.println();
        }
    }
}

class Patient {
    private String patientId;
    private String name;
    private int age;
    private String ailment;
    private ArrayList<Doctor> doctors;

    public Patient(String patientId, String name, int age, String ailment) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.doctors = new ArrayList<Doctor>();
    }

    public String getPatientName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if(!doctors.contains(doctor)) 
            doctors.add(doctor);
        else 
            System.out.println("Doctor Already There");
    }

    public void displayDoctors() {
        System.out.println("Patient Id: " + patientId);
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("Doctor Name: " + doctor.getDoctorName());
            System.out.println();
        }
    }
}

class Doctor {
    private String doctorId;
    private String doctorName;
    private ArrayList<Patient> patients;

    public Doctor(String doctorId, String doctorName) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.patients = new ArrayList<Patient>();
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void consult(Patient patient) {
        if(!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
            System.out.println(doctorName + " is consulting patient named " + patient.getPatientName());
        }
        else 
            System.out.println("Patient " + patient.getPatientName() + " is not consulting with " + doctorName);
    }

    public void displayPatients() {
        System.out.println("Doctor Id: " + doctorId);
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println("Patient Id: " + patient.getPatientName());
            System.out.println();
        }
    }
}

public class HospitalDoctorsAndPatients {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Lotus Hospital");

        Doctor doctor1 = new Doctor("D1", "Dr. John");
        Doctor doctor2 = new Doctor("D2", "Dr. Smith");
        Doctor doctor3 = new Doctor("D3", "Dr. Johnson");

        Patient patient1 = new Patient("P1", "Alice", 25, "Fever");
        Patient patient2 = new Patient("P2", "Bob", 30, "Cold");
        Patient patient3 = new Patient("P3", "Charlie", 35, "Headache");
        Patient patient4 = new Patient("P4", "David", 40, "Cough");
        
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addDoctor(doctor3);

        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);
        hospital.addPatient(patient4);

        hospital.display();

        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor1.consult(patient1);
    }
}