package az.edu.turing.module2.Lesson20.HomeTask;

public class Camera  extends  Device{
    public Camera(int id, String name, boolean status, DeviceType deviceType) {
        super(id, name, status, deviceType);
    }

@Override
    public void turnOn(){
        System.out.println("Turn on");
    }
@Override
    public void turnOff(){
        System.out.println("Turn off");
    }
}
