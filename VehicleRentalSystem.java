import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {return vehicleNumber;}
    public String getType() {return type;}
    public double getRentalRate() {return rentalRate;}

    public abstract double calculateRentalCost(int days);

    public void display() {
        System.out.println();
        System.out.println("Vehicle Number: " + getVehicleNumber());
        System.out.println("Vehicle Type: " + getType());
        System.out.println("Rental Rate: " + getRentalRate());
    }
}

interface Insurable {
    void calculateInsurance();
    double getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private double insurance;
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
        calculateInsurance();
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public void calculateInsurance() {
        this.insurance = getRentalRate() * 0.1;
    }

    @Override
    public double getInsuranceDetails() {
        return this.insurance;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Insurance Policy Number: " + this.insurancePolicyNumber);
        System.out.println("Insurance Cost: " + getInsuranceDetails());
    }
}

class Bike extends Vehicle implements Insurable {
    private double insurance;
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
        calculateInsurance();
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public void calculateInsurance() {
        this.insurance = getRentalRate() * 0.05;
    }

    @Override
    public double getInsuranceDetails() {
        return this.insurance;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Insurance Policy Number: " + this.insurancePolicyNumber);
        System.out.println("Insurance Cost: " + getInsuranceDetails());
    }
}

class Truck extends Vehicle implements Insurable {
    private double insurance;
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
        calculateInsurance();
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public void calculateInsurance() {
        this.insurance = getRentalRate() * 0.15;
    }

    @Override
    public double getInsuranceDetails() {
        return this.insurance;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Insurance Policy Number: " + this.insurancePolicyNumber);
        System.out.println("Insurance Cost: " + getInsuranceDetails());
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("KA 01 BV 1234", "Sedan", 1000, "12876834"));
        vehicles.add(new Bike("UP 01 AL 5678", "Sports", 500, "56746488"));
        vehicles.add(new Truck("AS 04 BB 4428", "Container", 1500, "64644666464"));

        for (Vehicle vehicle : vehicles) {
            vehicle.display();
            System.out.println("Rental Cost for 5 days: " + vehicle.calculateRentalCost(5));
            if (vehicle instanceof Insurable) 
                System.out.println("Insurance Cost: " + ((Insurable) vehicle).getInsuranceDetails());
            System.out.println();
        }
    }
}
