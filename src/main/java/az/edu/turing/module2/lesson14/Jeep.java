package az.edu.turing.module2.lesson14;

public class Jeep extends Car{
    private String name;

    public Jeep() {
        this.name = "Wowu";
    }

    @Override
    public void drive() {
        System.out.println("Jeep is driving");
    }

    @Override
    public void stop(){
        System.out.println("Jeep stopped");
    }
}
