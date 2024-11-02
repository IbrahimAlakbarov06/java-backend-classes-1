package as;

import java.util.Scanner;

public class MonthlyQuarterly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scan.nextInt();

        if (number>0 && number<13) {
            if (number>0 && number<4) {
                System.out.println("First");
            } else if (number>3 && number<7) {
                System.out.println("Second");
            } else if (number>8 && number<10) {
                System.out.println("Third");
            }else {
                System.out.println("Fourth");
            }
        } else {
            System.out.println("Error");
        }
    }
}
