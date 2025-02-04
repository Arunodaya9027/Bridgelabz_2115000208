class Vehicle {
    private String ownerName;
    private final String registrationNumber;
    private String vehicleType;
    static int registrationFee;

    Vehicle() {
        this.ownerName = "Anonymous";
        this.vehicleType = "SUV";
        this.registrationNumber = "0000";
    }

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(int newRegistrationFee) {
        registrationFee = newRegistrationFee;
    }

    void display() {
        if(this instanceof Vehicle) {
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
        }
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle.registrationFee = 5000;
        Vehicle vehicle1 = new Vehicle("Naman Kumar", "Mini-Bus", "UP16-1234");
        vehicle1.display();
        Vehicle vehicle2 = new Vehicle("Arpit Jain", "SUV", "UP16-5678");
        vehicle2.display();
        Vehicle.registrationFee = 3500;
        Vehicle vehicle3 = new Vehicle("Vaishali", "One-Day Scooty", "UP16-9101");
        vehicle3.display();
    }
}
