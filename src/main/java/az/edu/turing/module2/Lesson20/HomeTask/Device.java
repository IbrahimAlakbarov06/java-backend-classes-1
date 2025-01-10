package az.edu.turing.module2.Lesson20.HomeTask;

public class Device {
    public enum DeviceType { LIGHT, THERMOSTAT, CAMERA, DOORBELL };

    private int id;
    private String name;
    private boolean status;
    private DeviceType deviceType;

    public Device(int id, String name, boolean status, DeviceType deviceType) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.deviceType = deviceType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }
    public void turnOn(){
        System.out.println("Turned on");
    }
    public void turnOff(){
        System.out.println("Turned off");
    }
}
