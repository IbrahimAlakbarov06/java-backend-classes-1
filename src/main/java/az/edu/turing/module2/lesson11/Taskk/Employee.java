package az.edu.turing.module2.lesson11.Taskk;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
        if(isNull() == false){

        }
    }
    public Employee(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public boolean isNull(){
        boolean flag = true;
        if(name == null){
            System.out.println("You have to input name: ");
            flag = false;
        }
        return flag;
    }

    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Salary:" + salary);
    }
    public void calculateBonus(double percentage){
        double fixedSalary = (salary*percentage)/100;
        double fixedAmount= salary+fixedSalary;
        System.out.println(fixedAmount);
    }
}
