import java.util.*;

interface GPS {
    void getCurrentLocation();
    void updateLocation();
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {return vehicleId;}
    public String getDriverName() {return driverName;}
    public double getRatePerKm() {return ratePerKm;}

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + getVehicleId());
        System.out.println("Driver Name: " + getDriverName());
        System.out.println("Rate per Km: " + getRatePerKm());
    }
}

class Car extends Vehicle implements GPS {
    private String carType;

    public Car(String vehicleId, String driverName, double ratePerKm, String carType) {
        super(vehicleId, driverName, ratePerKm);
        this.carType = carType;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public void getCurrentLocation() {
        System.out.println("Getting current location of car");
    }

    @Override
    public void updateLocation() {
        System.out.println("Updating location of car");
    }

    @Override
    public void getVehicleDetails() {
        super.getVehicleDetails();
        System.out.println("Car Type: " + carType);
    }
}

class Bike extends Vehicle implements GPS {
    private String bikeType;

    public Bike(String vehicleId, String driverName, double ratePerKm, String bikeType) {
        super(vehicleId, driverName, ratePerKm);
        this.bikeType = bikeType;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public void getCurrentLocation() {
        System.out.println("Getting current location of bike");
    }

    @Override
    public void updateLocation() {
        System.out.println("Updating location of bike");
    }

    @Override
    public void getVehicleDetails() {
        super.getVehicleDetails();
        System.out.println("Bike Type: " + bikeType);
    }
}

class Auto extends Vehicle implements GPS {
    private String autoType;

    public Auto(String vehicleId, String driverName, double ratePerKm, String autoType) {
        super(vehicleId, driverName, ratePerKm);
        this.autoType = autoType;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public void getCurrentLocation() {
        System.out.println("Getting current location of auto");
    }

    @Override
    public void updateLocation() {
        System.out.println("Updating location of auto");
    }

    @Override
    public void getVehicleDetails() {
        super.getVehicleDetails();
        System.out.println("Auto Type: " + autoType);
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("C101", "Jaggu", 10, "Sedan"));
        vehicles.add(new Bike("B101", "Mohan", 5, "Sports"));
        vehicles.add(new Auto("A101", "Dhanush", 8, "Electric"));

        for(Vehicle vehicle: vehicles) {
            vehicle.getVehicleDetails();
            System.out.println("Fare: " + vehicle.calculateFare(20));
            if(vehicle instanceof GPS) {
                ((GPS) vehicle).getCurrentLocation();
                ((GPS) vehicle).updateLocation();
            }
        }
    }
}