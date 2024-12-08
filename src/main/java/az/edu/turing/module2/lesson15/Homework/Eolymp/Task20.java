package az.edu.turing.module2.lesson15.Homework.Eolymp;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        int counter = 0;

        while (n>9){
            int sum =0 ;
            while(n>0){
                sum += n%10;
                n/=10;
            }
            n-=sum;
            counter++;
        }
        System.out.println(counter);
    }
}
