package az.edu.turing.module2.lesson11.Taskk;

public abstract class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
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
