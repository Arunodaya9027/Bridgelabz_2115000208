package org.arunodaya;

import com.fasterxml.jackson.databind.ObjectMapper;

class Car {
    private final String brand;
    private String name;
    private String type;
    private int seats;
    private String engine;

    public Car(String brand, String name, String type, int seats, String engine) {
        this.brand = brand;
        this.name = name;
        this.type = type;
        this.seats = seats;
        this.engine = engine;
    }

    public String getBrand() { return brand; }
    public String getName() { return name; }
    public String getType() { return type; }
    public int getSeats() { return seats; }
    public String getEngine() { return engine; }
}

public class ConvertJavaObjectToJson {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Car car = new Car("Ferrari", "F80", "Sports", 2, "V8 Hybrid");
            String jsonString = objectMapper.writeValueAsString(car);
            System.out.println(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
