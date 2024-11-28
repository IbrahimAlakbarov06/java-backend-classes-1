package az.edu.turing.module2.lesson11.HomeTask.TaskC;

import java.util.Scanner;

public class PyramidApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pyramid pyramid = new Pyramid();

        System.out.print("Enter number: ");
        pyramid.setNumber(scan.nextInt());
        int number = pyramid.getNumber();

        for (int i = number; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
