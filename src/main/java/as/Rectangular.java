package as;

import java.util.Scanner;

public class Rectangular {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first length: ");
        int first = scan.nextInt();
        System.out.print("Enter second length: ");
        int second = scan.nextInt();
        System.out.print("Enter third length: ");
        int third = scan.nextInt();

        if ((first>second && first>third )){
            System.out.println((first*first == second*second + third*third) ? "YES" : "NO" );
        } else if (second>first && second>third) {
            System.out.println((second*second == first*first + third*third) ? "YES" : "NO" );
        }else {
            System.out.println((third*third == second*second + first*first) ? "YES" : "NO" );
        }


    }
}
