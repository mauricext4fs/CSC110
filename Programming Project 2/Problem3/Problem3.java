import java.util.Scanner;

public class Problem3
{
    public static void main(String[] args)
    {
        Problem3 problem = new Problem3();
        Scanner keyboard = new Scanner(System.in);
        int points = problem.askForPoints(keyboard);
        char grade = problem.getGrade(points);
        System.out.println("Grade: " + grade);
        System.exit(0);
    }

    private int askForPoints(Scanner keyboard)
    {
        int points = 0;

        // The user must tell us the Capacity in the tank
        while (points == 0) {
            System.out.print("Please enter the number of points: ");
            while (!keyboard.hasNextInt()) {
                System.out.print("Wrong value... please enter whole number bigger than 0: ");
                keyboard.nextLine();
            }
            points = keyboard.nextInt();
            /*
             * The Problem is buggy since many points value
             * will result in no grade and we need to test
             * for those now
             */
            if (points >= 60 && points < 70) {
                System.out.print("Sorry... as it is, with the rule that has been set up... points between 60 and 69 \n" +
                        "does not result in any grade. Consider giving a free increase of 10 points.\n" +
                        "Please enter the number of points again: ");
                // Force it to do another loop
                points = 0;
            }
        }

        return points;
    }

    private char getGrade(int points)
    {
        // Initialize grade with char NUL
        char grade = 0;
        if (points < 60) {
            grade = 'D';
        } else if (points >= 70 && points < 80) {
            grade = 'C';
        } else if (points >= 80 && points < 90) {
            grade = 'B';
        } else if (points >= 90 && points <= 100) {
            grade = 'A';
        }

        return grade;
    }
}


