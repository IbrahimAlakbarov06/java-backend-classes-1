package az.edu.turing.module3.lesson1;

import java.util.Scanner;

public class ExpeptionHandling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ages = new int[50];
        int index = 0;

        while (index < 50) {
            System.out.print("Enter an age: ");
            String input = scan.nextLine();

            if (input.equals("stop") || input.equals("exit")) {
                break;
            }

            try {
                int age = Integer.parseInt(input);
                if (age < 0) {
                    throw new IllegalArgumentException("Age cannot be negative.");
                } else if (age > 200) {
                    throw new ArithmeticException("Age is too high.");
                }

                ages[index] = age;
                index++;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Entered Ages: [");
        for (int i = 0; i < index; i++) {
            System.out.print(ages[i]);
            if (i < index - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println("Details for each age:");
        for (int i = 0; i < index; i++) {
            String oddeven = isEven(ages[i]);
            try {
                long factorial = factorial(ages[i]);
                System.out.println("- Age: " + ages[i] + " -> Factorial: " + factorial + ", " + oddeven + ".");
            } catch (ArithmeticException e) {
                System.out.println("- Age: " + ages[i] + " -> Factorial too large to calculate, " + oddeven + ".");
            }
        }

        getStatistics(ages, index);
    }

    public static String isEven(int age) {
        return (age % 2 == 0) ? "Even" : "Odd";
    }

    public static long factorial(int age) {
        if (age > 20) {
            throw new ArithmeticException("Factorial too large to calculate.");
        }
        long f = 1;
        for (int i = 1; i <= age; i++) {
            f *= i;
        }
        return f;
    }

    public static void getStatistics(int[] ages, int count) {
        if (count == 0) {
            System.out.println("No valid ages entered.");
            return;
        }

        int sumOfAges = 0;
        int child = 0;
        int teenager = 0;
        int adult = 0;
        int senior = 0;

        for (int i = 0; i < count; i++) {
            int age = ages[i];
            sumOfAges += age;

            if (age <= 12) {
                child++;
            } else if (age <= 19) {
                teenager++;
            } else if (age <= 64) {
                adult++;
            } else {
                senior++;
            }
        }

        double avg = (double) sumOfAges / count;

        System.out.println("\nStatistical Summary:");
        System.out.println("- Total number of people: " + count);
        System.out.println("- Sum of ages: " + sumOfAges);
        System.out.printf("- Average age: %.1f\n", avg);
        System.out.println("- Age Group Statistics:");
        System.out.println(" * Children: " + child + " person" + (child == 1 ? "" : "s"));
        System.out.println(" * Teenager: " + teenager + " person" + (teenager == 1 ? "" : "s"));
        System.out.println(" * Adult: " + adult + " person" + (adult == 1 ? "" : "s"));
        System.out.println(" * Senior: " + senior + " person" + (senior == 1 ? "" : "s"));
    }
}
