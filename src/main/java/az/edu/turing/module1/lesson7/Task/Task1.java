package az.edu.turing.module1.lesson7.Task;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter: ");//salam
        String name = scan.nextLine();
        char lastChar = name.charAt(name.length() - 1);
        System.out.println("Last character is: " + lastChar);
    }
}
