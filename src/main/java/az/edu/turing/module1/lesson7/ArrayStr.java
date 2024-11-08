package az.edu.turing.module1.lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStr {
    public static void main(String[] args) {
//        String[] names = new String[5];
//        names[0] = "Turing";
//        names[1] = "Turing";
//        names[2] = "Turing";
//        names[3] = "Turing";
//        names[4] = "Turing";
//        System.out.println(names);
//        names[4] = "Faxri";
//        System.out.println(Arrays.toString(names));
        int[][] number = new int[2][2];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.println("");
                number[i][j] = scan.nextInt();
            }
        }

        int max = number[0][0];
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {

                if (number[i][j] > max) {
                    max = number[i][j];
                }
            }
        }
        System.out.println(max);


    }
}
