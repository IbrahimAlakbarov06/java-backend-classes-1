package az.edu.turing.module1.lesson8.Tasks;

import java.util.Random;
import java.util.Scanner;

public class ShootingSqeuare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        char[][] square = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                square[i][j] = '-';
            }
        }

        int randomRow = random.nextInt(5);
        int randomCol = random.nextInt(5);
        int guessCount = 0;

        while (true) {
            guessCount++;
            //Input
            System.out.print("Enter row (1-5): ");
            int row = scan.nextInt() - 1;
            if (row < 0 || row >= 5) {
                System.out.println("Error. Your row number is invalid. Please enter a number between 1 and 5.");
                continue;
            }

            System.out.print("Enter column (1-5): ");
            int col = scan.nextInt() - 1;
            if (col < 0 || col >= 5) {
                System.out.println("Error. Your column number is invalid. Please enter a number between 1 and 5.");
                continue;
            }

            //Process
            if (row == randomRow && col == randomCol) {
                square[row][col] = 'X';
                printSquare(square);
                System.out.println("You have won!");
                System.out.println("You find it " + guessCount + " times.");
                break;
            } else {
                square[row][col] = '*';
                printSquare(square);
                System.out.println("Try again!");
            }
        }
    }

    //Output
    public static void printSquare(char[][] square) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }
}
