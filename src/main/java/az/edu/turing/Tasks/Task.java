package az.edu.turing.Tasks;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scan.nextInt();

        String result = (num == 0) ? "Zero" :
                (num < 0 && num % 2 == 0) ? "Negative And Even" :
                        (num > 0 && num % 2 == 0) ? "Positive And Even" :
                                (num < 0 && num % 2 == 1) ? "Negative And Odd" :
                                        "Positive And Odd";
        System.out.println(result);

    }
}
