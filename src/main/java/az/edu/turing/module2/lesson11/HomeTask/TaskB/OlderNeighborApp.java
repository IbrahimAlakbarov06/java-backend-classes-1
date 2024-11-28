package az.edu.turing.module2.lesson11.HomeTask.TaskB;

import az.edu.turing.module2.lesson11.HomeTask.TaskD.GreatestElement;

import java.util.Scanner;

public class OlderNeighborApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        OlderNeighbor older = new OlderNeighbor();
        System.out.print("Enter size of array: ");
        int size = scan.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        int counter = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                counter++;
            }
        }

        older.setCount(counter);
        System.out.println("The count of older neighbor is: " + older.getCount());
    }
}
