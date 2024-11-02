package as;

import java.util.Scanner;

public class MedianNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a: ");
        int a =scan.nextInt();
        System.out.print("Please enter b: ");
        int b =scan.nextInt();
        System.out.print("Please enter c: ");
        int c =scan.nextInt();

        int median;

        if ((a>b && a<c) || (a<b && a>c)){
            median = a;
        }else if ((b>c && b<a) || (b<c && b>a)) {
            median = b;
        }else {
            median = c;
        }

        System.out.println("Median is: " + median);
    }
}
