package az.edu.turing.module2.lesson11.Task;

public class Cat extends Animal{
    private String gender;

    public Cat(String name, int age, String gender){
        super(name, age);
        this.gender=gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
