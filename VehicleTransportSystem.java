abstract class Vehicle {
    private int maxSpeed;
    private String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public abstract void displayInfo();
}

class Car extends Vehicle {
    private int seatCapacity;

    public Car(int maxSpeed, String fuelType) {
        super(maxSpeed, fuelType);
        this.seatCapacity = 5;
    }

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Max Speed: %d\n", getMaxSpeed());
        System.out.printf("Fuel Type: %s\n", getFuelType());
        System.out.printf("Seat Capacity: %d\n", seatCapacity);
        System.out.println();
    }
}

class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(int maxSpeed, String fuelType) {
        super(maxSpeed, fuelType);
        this.loadCapacity = 0;
    }

    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Max Speed: %d\n", getMaxSpeed());
        System.out.printf("Fuel Type: %s\n", getFuelType());
        System.out.printf("Load Capacity: %d\n", loadCapacity);
        System.out.println();
    }
}

class Motorcycle extends Vehicle {
    private String color;

    public Motorcycle(int maxSpeed, String fuelType) {
        super(maxSpeed, fuelType);
        this.color = "Unknown";
    }

    public Motorcycle(int maxSpeed, String fuelType, String color) {
        super(maxSpeed, fuelType);
        this.color = color;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Max Speed: %d\n", getMaxSpeed());
        System.out.printf("Fuel Type: %s\n", getFuelType());
        System.out.printf("Color: %s\n", color);
        System.out.println();
    }
}

public class VehicleTransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(100, "Petrol", 5), new Truck(80, "Diesel", 1000), new Motorcycle(120, "Petrol", "Red")};

        for(Vehicle vehicle: vehicles) 
            vehicle.displayInfo();
    }
}
