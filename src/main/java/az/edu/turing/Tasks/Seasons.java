package az.edu.turing.Tasks;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scan.nextInt();

        System.out.println(num == 1 ? "It's Janruary and Winter" : num == 2 ? "It's February and Winter" : num == 3 ? "It's Janruary and Winter" : num == 3 ? "It's Janruary and Winter" : num == 4 ? "It's Janruary and Spring" : num == 5 ? "It's May and Spring" : num == 6 ? "It's June and Summer" : num == 7 ? "It's July and Summer" : num == 8 ? "It's August and Summer" : num == 9 ? "It's September and Autumn" : num == 10 ? "It's October and Autumn" : num == 11 ? "It's November and Autumn" : num == 12 ? "It's December and Winter" : "Wrong");
    }
}
