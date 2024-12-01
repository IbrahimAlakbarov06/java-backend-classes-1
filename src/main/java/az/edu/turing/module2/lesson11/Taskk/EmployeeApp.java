package az.edu.turing.module2.lesson11.Taskk;
import java.util.Scanner;
public class EmployeeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employee =new Employee[2];
        employee[0]=new Manager(null, 2000,3);
        employee[1]= new Developer("Ibis", 5000, "Java");


       // employee[0].calculateBonus(10);
        for (int i =0; i< employee.length; i++){
            employee[i].calculateBonus(10);
            while(employee[i].isNull()){

            }



        }
    }



}
