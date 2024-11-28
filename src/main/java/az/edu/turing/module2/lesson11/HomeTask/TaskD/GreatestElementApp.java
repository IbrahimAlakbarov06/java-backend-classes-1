package az.edu.turing.module2.lesson11.HomeTask.TaskD;

import java.util.Scanner;

public class GreatestElementApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GreatestElement maxNum = new GreatestElement();
        System.out.print("Enter size of array: ");
        int size = scan.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        int max = array[0];
        int place = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                place = i + 1;
            }
        }
        maxNum.setNumber(max);
        maxNum.setPlaceNum(place);
        System.out.println("The greatest number and its place number: " + maxNum.getNumber() + " " + maxNum.getPlaceNum());


    }

}
