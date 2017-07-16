import java.util.Scanner;
public class Problem1
{

    public static void main(String[] args)
    {
        Problem1 problem = new Problem1();
        problem.FuelCalculator();
    }

    public void FuelCalculator()
    {
        int fuelAmount;
        int fuelCapacity = 0;
        double fuelPercent;

        // Initiate a Scanner Object
        Scanner keyboard = new Scanner(System.in);

        // The user must tell us the Capacity in the tank
        while (fuelCapacity == 0) {
            System.out.print("Enter the fuel capacity of the Vehicle fuel tank: ");
            while (!keyboard.hasNextInt()) {
                System.out.println("Wrong value... please enter whole number bigger than 0: ");
                keyboard.nextLine();
            }
            fuelCapacity = keyboard.nextInt();
        }

        // Now Asking for the current amount
        System.out.print("Now enter the current amount in the fuel tank: ");
        fuelAmount = this.readFuelAmount(keyboard);

        /*
         * If the current reading is less than 10 percent of the
         * tank capcity we must print "red" otherwise "green"
         */
        fuelPercent = (double) fuelAmount / fuelCapacity;
        if (fuelPercent < 0.1) {
            System.out.println("red");
        } else {
            System.out.println("green");

        }

        keyboard.close();
    }

    private int readFuelAmount(Scanner keyboard)
    {
        return keyboard.nextInt();
    }
}


