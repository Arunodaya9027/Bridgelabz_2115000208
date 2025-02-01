class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee;

    public Vehicle() {
        this.ownerName = "Anonymous";
        this.vehicleType = "General";
    }

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    public static void updateRegistrationFee(double newRegistrationFee) {
        registrationFee = newRegistrationFee;
    }
}

public class VehicleRegistration {
    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(100.0);
        Vehicle vehicle1 = new Vehicle("Arunodaya Pratap Singh", "Car");
        vehicle1.displayVehicleDetails();
        System.out.println();
        Vehicle vehicle2 = new Vehicle("Tushar Jain", "Motorcycle");
        vehicle2.displayVehicleDetails();
    }
}