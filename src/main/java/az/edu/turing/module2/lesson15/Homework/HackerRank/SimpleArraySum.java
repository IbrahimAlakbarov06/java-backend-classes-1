package az.edu.turing.module2.lesson15.Homework.HackerRank;

import java.util.Scanner;

public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];

        for (int i =0; i< size; i++){
            array[i]= scan.nextInt();
        }
        int sum =0;
        for (int i =0; i< size; i++){
            sum += array[i];
        }
        System.out.println(sum);
    }
}
