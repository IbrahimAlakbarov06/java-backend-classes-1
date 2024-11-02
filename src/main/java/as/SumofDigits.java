package as;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scan.nextInt();

        if (number>999 && number<10000){
            int firstDigit = number / 1000;
            int lastDigit = number % 10;
            System.out.println(firstDigit + lastDigit);
        }else {
            System.out.println("Wrong number");
        }
    }
}
