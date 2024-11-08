package az.edu.turing.module1.lesson7;

import java.util.Arrays;

public class ArrayTask {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 24, 6, 64, 765, 4, 63, 245};
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}

