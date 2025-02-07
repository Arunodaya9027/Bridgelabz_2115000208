interface Refuelable {
    public void refuel();    
}

class Vehicle {
    private int maxSpeed;
    private String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getModel() {
        return this.model;
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling petrol Vehicle");
    }
}

class ElectricVehicle extends Vehicle {
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println("Charging Electric Vehicle");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        PetrolVehicle petrolVehicle = new PetrolVehicle(100, "P1");
        petrolVehicle.refuel();

        ElectricVehicle electricVehicle = new ElectricVehicle(120, "E1");
        electricVehicle.charge();
    }
}
