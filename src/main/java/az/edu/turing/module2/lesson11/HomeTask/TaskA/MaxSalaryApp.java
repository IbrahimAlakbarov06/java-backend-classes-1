package az.edu.turing.module2.lesson11.HomeTask.TaskA;

import java.util.Scanner;

public class MaxSalaryApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter employees salary: ");
        String input = scan.nextLine();
        String[] salarieStr = input.split(" ");

        double[] salaries = new double[salarieStr.length];
        for (int i = 0; i < salarieStr.length; i++) {
            salaries[i] = Double.valueOf(salarieStr[i]);
        }

        MaxSalary maxSalary = new MaxSalary();
        double max = 0.0;
        for (double salary : salaries) {
            if (max < salary) {
                max = salary;
            }
        }

        maxSalary.setSalary(max);
        System.out.printf("Maximum salary is %.2f", maxSalary.getSalary());
    }
}
