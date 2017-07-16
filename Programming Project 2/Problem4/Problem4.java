public class Problem4
{
    private static double INTEREST_RATE = 0.05; // 5%

    public static void main(String[] args)
    {
        Problem4 problem = new Problem4();
        int numYear = problem.howManyYearToDouble(10000);
        System.out.println("It will take " + numYear + " year to get 20k balance in the account.");
        System.exit(0);
    }

    /**
     * This presume we are calculating compound interest rate
     * yearly.
     */
    private int howManyYearToDouble(double amount)
    {
        double doubleAmount = amount * 2;
        double sum = amount;
        int numYear = 0;

        while (sum < doubleAmount) {
            numYear++;
            sum = (sum + (sum * INTEREST_RATE));
        }

        return numYear;
    }

}


