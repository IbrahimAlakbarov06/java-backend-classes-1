package az.edu.turing.module1.lesson8.Tasks;

import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] schedule = new String[7][2];

        schedule[0][0] = "Monday";
        schedule[0][1] = "do homework";
        schedule[1][0] = "Tuesday";
        schedule[1][1] = "listening to music";
        schedule[2][0] = "Wednesday";
        schedule[2][1] = "go to gym";
        schedule[3][0] = "Thursday";
        schedule[3][1] = "do shopping";
        schedule[4][0] = "Friday";
        schedule[4][1] = "meet friends";
        schedule[5][0] = "Saturday";
        schedule[5][1] = "go for a walk";
        schedule[6][0] = "Sunday";
        schedule[6][1] = "watch movie";

        while (true) {
            //Input
            System.out.print("Please, input the day of the week: ");
            String input = scan.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Program exiting...");
                break;
            }
            //Process or output
            switch (input) {

                case "monday":
                    System.out.println("Your task for Monday: " + schedule[0][1]);
                    break;
                case "tuesday":
                    System.out.println("Your task for Tuesday: " + schedule[1][1]);
                    break;
                case "wednesday":
                    System.out.println("Your task for Wednesday: " + schedule[2][1]);
                    break;
                case "thursday":
                    System.out.println("Your task for Thursday: " + schedule[3][1]);
                    break;
                case "friday":
                    System.out.println("Your task for Friday: " + schedule[4][1]);
                    break;
                case "saturday":
                    System.out.println("Your task for Saturday: " + schedule[5][1]);
                    break;
                case "sunday":
                    System.out.println("Your task for Sunday: " + schedule[6][1]);
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");

                    //Change reschedule hissesini yaza bilmedim :(            }
            }
        }
    }
}
