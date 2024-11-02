package as;

import java.util.Scanner;

public class FirstLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int a =scan.nextInt();
        if(a>99 && a<1000){
            int b = a/100;
            int c = a % 100;
            int d = c /10;
            int e = a % 10;

            if (b>d && b>e) {
                System.out.print(b);
            } else if (d>b && d>e) {
                System.out.print(d);
            } else if (e>b && e>d) {
                System.out.println(e);
            }
        } else {
            System.out.println("Wrong number");
        }
    }
}
