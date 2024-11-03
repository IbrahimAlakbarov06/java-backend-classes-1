package az.edu.turing.Lesson1;

import java.util.Scanner;

public class NumberApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        System.out.println((num % 2 ==1 ) ? "tek" : "cut");

    }
}
