package az.edu.turing.module2.lesson15.Homework.Eolymp;
import java.util.Scanner;

public class Task8893 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n % 6 == 0 && n > 9 && n<100 ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
