package az.edu.turing.Tasks;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scan.nextInt();


        String result = (num < 0 ? "Negative" : (num > 0 ? "Positive " : "Zero"));
        System.out.println(result);



        /*if (num % 2 == 0 && num > 0) {
            System.out.println("Eded cutdur ve musbetdir");
        } else if (num % 2 == 1 && num > 0) {
            System.out.println("Eded tekdir ve musbetdir");
        } else if (num % 2 == 0 && num < 0) {
            System.out.println("Eded cutdur ve menfidir");
        } else if (num % 2 == 1 && num < 0) {
            System.out.println("Eded tekdir ve menfidir");
        } else {
            System.out.println("Eded sifirdir");
        }*/
    }
}
