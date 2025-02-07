class Device {
    private String deviceId;
    private boolean status;

    public Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    
    public void displayStatus() {
        System.out.println();
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

class Thermostat extends Device {
    private int temperatureSetting;

    public Thermostat(String deviceId, boolean status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting);
    }
}

public class SmartHomeDevices {
    public static void main(String[] args) {
        Device device = new Device("D1", true);
        device.displayStatus();
        
        Device thermostat = new Thermostat("D2", false, 24);
        thermostat.displayStatus();
    }   
}
