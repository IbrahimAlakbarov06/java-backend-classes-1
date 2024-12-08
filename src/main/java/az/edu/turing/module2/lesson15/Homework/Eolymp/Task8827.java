package az.edu.turing.module2.lesson15.Homework.Eolymp;
import java.util.Scanner;

public class Task8827 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y1 = (Math.pow(x, 2) + 3 * x - 4) / (2 * x - 3); // Birinci ifadə
        double y2 = (x + 2) / (Math.pow(x, 2) - 5 * x + 7);
        double y = y1-y2;
        System.out.printf("%.3f",y);
    }
}
