package az.edu.turing.module2.lesson11.Taskk;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee[] employee =new Employee[2];
        employee[0]=new Manager("Ali",2000,3);
        employee[1]= new Developer("Ibis", 5000, "Java");

       // employee[0].calculateBonus(10);
        for (int i =0; i< employee.length; i++){
            employee[i].calculateBonus(10);
        }
    }



}
