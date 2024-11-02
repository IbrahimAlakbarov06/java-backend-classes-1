package as;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int a =scan.nextInt();
        if(a>99 && a<1000){
            int digit1 = a/100;
            int c = a % 100;
            int digit2 = c /10;
            int digit3 = a % 10;

            int sumDigit = digit1 + digit2 + digit3;
            float b = (float) Math.sqrt(sumDigit);
            System.out.printf("%.3f", b);



        }
    }
}
