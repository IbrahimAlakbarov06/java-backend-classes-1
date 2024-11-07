package az.edu.turing.module1.Lesson1;

import java.util.Scanner;

public class Salam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a =scan.nextInt();
        int b = scan.nextInt();

        System.out.println(multiplyTwonum(a, b));
    }
    public static int multiplyTwonum(int a, int b){
        return a*b;
    }

}


