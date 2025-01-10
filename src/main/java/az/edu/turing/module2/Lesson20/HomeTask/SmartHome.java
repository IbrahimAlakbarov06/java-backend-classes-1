package az.edu.turing.module2.Lesson20.HomeTask;

import java.util.ArrayList;
import java.util.List;

public class SmartHome {
    private List<User> users = new ArrayList<>();
    private List<Device> devices = new ArrayList<>();

    public SmartHome() {
        users = new ArrayList<>();
        devices = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User " + user.getFirstName() + " added.");
    }

    public void removeUser(User user) {
        users.remove(user);
        System.out.println("User " + user.getFirstName() + " removed.");
    }

    public void addDevice(Device device) {
        devices.remove(device);
        System.out.println("Device" + device.getDeviceType() + "added.");
    }

    public void getDeviceStatus(int id) {
        boolean status = devices.get(id).isStatus();
        String statusStr = "";
        if (status) {
            statusStr = "Active";
        } else {
            statusStr = "Not active";
        }
        System.out.println("Device status is :" + statusStr);
    }
}
