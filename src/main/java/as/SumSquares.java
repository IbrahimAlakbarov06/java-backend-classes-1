package as;

import java.util.Scanner;

public class SumSquares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a: ");
        int a =scan.nextInt();
        System.out.print("Please enter b: ");
        int b = scan.nextInt();
        int c = a*a;
        int d = b*b;
        System.out.println(c+d);
    }
}
