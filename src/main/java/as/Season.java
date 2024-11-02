package as;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int a = scan.nextInt();
        if (a == 3 || a == 4 || a == 5){
            System.out.print("Spring");
        }else if (a == 6 || a == 7 || a == 8){
            System.out.print("Summer");
        }else if (a == 9 || a == 10 || a == 11){
            System.out.print("Autumn");
        }else if (a == 12 || a == 1 || a == 2){
            System.out.print("Winter");
        }else{
            System.out.println("Wrong number");
        }

    }
}
