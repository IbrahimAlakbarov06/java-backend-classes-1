package az.edu.turing.module2.lesson11.HomeTask.TaskA;

public class MaxSalary {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0 && salary <= 1000) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be between 0 and 1000");
        }
    }

}
