package az.edu.turing.module1.lesson8;

import java.util.Scanner;

public class SumApp {
    public static void main(String[] args) {
        String[][] schedule = {
                {"Sunday", "do homework"},
                {"Monday", "go to courses; watch a film"},
                {"Tuesday", "gym; reading"},
                {"Wednesday", "grocery shopping"},
                {"Thursday", "study group"},
                {"Friday", "visit family"},
                {"Saturday", "movie night"}
        };

        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Please, input the day of the week (or type 'exit' to quit):");
            input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                break;
            }

            // Eğer "change" veya "reschedule" ile başlıyorsa
            if (input.startsWith("change ") || input.startsWith("reschedule ")) {
                String day = input.split(" ")[1];
                boolean dayFound = false;

                for (String[] dayTask : schedule) {
                    if (dayTask[0].equals(day)) {
                        System.out.println("Please, input new tasks for " + dayTask[0] + ":");
                        dayTask[1] = scanner.nextLine().trim(); // Yeni görevi kaydet
                        System.out.println("Tasks updated for " + dayTask[0] + ".");
                        dayFound = true;
                        break;
                    }
                }

                if (!dayFound) {
                    System.out.println("Sorry, I don't understand you, please try again.");
                }
            } else {
                boolean validDay = false;
                for (String[] dayTask : schedule) {
                    if (dayTask[0].equals(input)) {
                        System.out.println("Your tasks for " + dayTask[0] + ": " + dayTask[1]);
                        validDay = true;
                        break;
                    }
                }

                if (!validDay) {
                    System.out.println("Sorry, I don't understand you, please try again.");
                }
            }
        }

        scanner.close();
    }
}
