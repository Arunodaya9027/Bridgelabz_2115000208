import java.util.*;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() {return patientId;}
    public String getName() {return name;}
    public int getAge() {return age;}

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println();
        System.out.println("Patient Id: " + getPatientId());
        System.out.println("Patient Name: " + getName());
        System.out.println("Patient Age: " + getAge());
    }
}

class InPatient extends Patient implements MedicalRecord {
    private double roomCharge;
    private double appointmentFee;
    private String diagnosis;
    private ArrayList<String> medicalHistory;

    public InPatient(String patientId, String name, int age, double roomCharge, double appointmentFee) {
        super(patientId, name, age);
        this.roomCharge = roomCharge;
        this.appointmentFee = appointmentFee;
        this.medicalHistory = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return roomCharge + appointmentFee;
    }

    public void addRecord(String record) {
        this.diagnosis = record;
        this.medicalHistory.add(record);
    }

    public void viewRecords() {
        System.out.println("Diagnosis: " + diagnosis);
        System.out.print("Medical History: ");
        for(int i=0; i<medicalHistory.size()-1; i++) { 
            System.out.print(medicalHistory.get(i));
            if (i < medicalHistory.size() - 1)
                System.out.print(", ");
        }
        System.out.println();
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double doctorFee;
    private double medicineCharge;
    private String diagnosis;
    private ArrayList<String> medicalHistory;


    public OutPatient(String patientId, String name, int age, double doctorFee, double medicineCharge) {
        super(patientId, name, age);
        this.doctorFee = doctorFee;
        this.medicineCharge = medicineCharge;
        this.medicalHistory = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return doctorFee + medicineCharge;
    }

    public void addRecord(String record) {
        this.diagnosis = record;
        this.medicalHistory.add(record);
    }

    public void viewRecords() {
        System.out.println("Diagnosis: " + diagnosis);
        System.out.print("Medical History: ");
        for(int i=0; i<medicalHistory.size()-1; i++) {
            System.out.print(medicalHistory.get(i));
            if (i < medicalHistory.size() - 1) 
                System.out.print(", ");
        }
        System.out.println();
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        InPatient inPatient = new InPatient("P001", "Sumit", 45, 2000, 500);
        inPatient.addRecord("Fever");
        inPatient.getPatientDetails();
        inPatient.viewRecords();
        System.out.println("Total Bill: " + inPatient.calculateBill());

        OutPatient outPatient = new OutPatient("P002", "Arunodaya", 35, 300, 200);
        outPatient.addRecord("Cough");
        outPatient.getPatientDetails();
        outPatient.viewRecords();
        System.out.println("Total Bill: " + outPatient.calculateBill());

        outPatient.addRecord("Headache");
        outPatient.getPatientDetails();
        outPatient.viewRecords();
        System.out.println("Total Bill: " + outPatient.calculateBill());

        outPatient.addRecord("Fever");
        outPatient.getPatientDetails();
        outPatient.viewRecords();
        System.out.println("Total Bill: " + outPatient.calculateBill());
    }
}