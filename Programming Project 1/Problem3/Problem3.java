public class Problem3 {
    private static final int WIDTH_OF_FIRST_COLUMN = 30;
    private static final int WIDTH_OF_SECOND_COLUMN = 100;
    private static final int WIDTH_OF_LASTROW_SECOND_COLUMN = 90;
    private static final int WIDTH_OF_LASTROW_THIRD_COLUMN = 10;
    private static final int HEIGHT_OF_ROWA1 = 60;
    private static final int HEIGHT_OF_ROWA2 = 160;
    private static final int HEIGHT_OF_ROWB1 = 80;
    private static final int HEIGHT_OF_ROWC1 = 60;
    private static final int HEIGHT_OF_ROWC2 = 29;
    private static final String BEIGE = "+";
    private static final String DARKRED = "@";
    private static final String DARBLUE = ":";
    private static final String YELLOW = "#";

    public static void main(String[] args)
    {
        Problem3 problem = new Problem3();
        problem.printFirstRow();
    }

    private void printFirstRow()
    {
        int TotalLength = WIDTH_OF_FIRST_COLUMN + 3 + WIDTH_OF_SECOND_COLUMN;
        for (int i = 0; i < TotalLength; i++) {
            if (i < WIDTH_OF_FIRST_COLUMN) {
                // Printing the first Beige square
                System.out.print(BEIGE);
            } else if (i >= WIDTH_OF_FIRST_COLUMN && i < (TotalLength - WIDTH_OF_SECOND_COLUMN)) {
                // Printing the border between the first row beige and red square
                System.out.print("|");
            } else if (i >= (TotalLength - WIDTH_OF_SECOND_COLUMN)) {
                // Printing the border between the first row beige and red square
                System.out.print(DARKRED);
            }
        }

    }

} 

