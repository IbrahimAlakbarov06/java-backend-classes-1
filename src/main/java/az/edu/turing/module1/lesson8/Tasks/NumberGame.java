package az.edu.turing.module1.lesson8.Tasks;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        //Input
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Let the game begin!");

        int number = random.nextInt(100);

        int guessCount = 0;
        int[] guessNumber = new int[100];
        //Process
        while (true) {
            System.out.print("Guess the number: ");
            int guess = scan.nextInt();
            //Texmin sayisi ve hansi texminler
            guessCount++;
            guessNumber[guessCount] = guess;

            if (guess < number) {
                System.out.println("Your number is too small. Please, try again..");
            } else if (guess > number) {
                System.out.println("Your number is too big. Please, try again..");
            } else {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }

        System.out.print("Your guesses are: ");
        sortNumber(guessNumber);
        for (int i = 0; i < guessCount; i++) {
            System.out.print(guessNumber[i] + " ");
        }

    }

    //From larger to smaller
    public static void sortNumber(int[] sort) {
        for (int i = 0; i < sort.length; i++) {
            for (int j = i + 1; j < sort.length; j++) {
                if (sort[i] < sort[j]) {
                    int temp = sort[i];
                    sort[i] = sort[j];
                    sort[j] = temp;
                }
            }
        }
    }
}
