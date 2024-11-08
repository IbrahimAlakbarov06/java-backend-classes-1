package az.edu.turing.module1.lesson7.Task;

import java.util.Scanner;

public record Task2() {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter: ");
        String name = scan.nextLine();
        char lastChar = name.charAt(name.length() - 1);
        if (lastChar == 'a' || lastChar == 'u' || lastChar == 'o' || lastChar == 'i' || lastChar == 'e') {
            System.out.println("Last character is vowel");
        } else {
            System.out.println("Last character is not vowel");
        }

    }
}
