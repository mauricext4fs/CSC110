public class Problem5
{
    public static void main(String[] args)
    {
        Problem5 problem = new Problem5();
        problem.printTable();
        System.exit(0);
    }

    private void printTable()
    {
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
        }

    }

}


