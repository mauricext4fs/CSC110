public class Problem3 {
    private static final int WIDTH_OF_FIRST_COLUMN = 20;
    private static final int WIDTH_OF_SECOND_COLUMN = 70;
    private static final int WIDTH_OF_LASTROW_SECOND_COLUMN = 67;
    private static final int WIDTH_OF_LASTROW_THIRD_COLUMN = 6;
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

        problem.printFirstGroup();
        problem.printSecondRow();
        problem.printSecondGroup();
        problem.printAllBlackRow();
        problem.printThirdGroup();
        problem.printFirstRowOfLastGroupBlack();
        problem.printForthGroup();
    }

    private void printFirstGroup()
    {
        for (int i = 0; i < 5; i++) {
            printFirstRow();
        }
    }

    private void printSecondGroup()
    {
        for (int i = 0; i < 7; i++) {
            printFirstRow();
        }
    }

    private void printThirdGroup()
    {
        for (int i = 0; i < 3; i++) {
            printFirstRowOfLastGroupBeige(BEIGE);
        }
    }

    private void printForthGroup()
    {
        for (int i = 0; i < 3; i++) {
            printFirstRowOfLastGroupBeige(YELLOW);
        }
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
        System.out.println(" ");

    }

    private void printSecondRow()
    {
        int TotalLength = WIDTH_OF_FIRST_COLUMN + 3 + WIDTH_OF_SECOND_COLUMN;
        for (int i = 0; i < TotalLength; i++) {
            if (i < WIDTH_OF_FIRST_COLUMN) {
                // Printing the first Beige square
                System.out.print("|");
            } else if (i >= WIDTH_OF_FIRST_COLUMN && i < (TotalLength - WIDTH_OF_SECOND_COLUMN)) {
                // Printing the border between the first row beige and red square
                System.out.print("|");
            } else if (i >= (TotalLength - WIDTH_OF_SECOND_COLUMN)) {
                // Printing the border between the first row beige and red square
                System.out.print(DARKRED);
            }
        }
        System.out.println(" ");

    }

    private void printFirstRowOfLastGroupBeige(String lastSquareColor)
    {
        int TotalLength = WIDTH_OF_FIRST_COLUMN + 3 + WIDTH_OF_LASTROW_SECOND_COLUMN + 3 + WIDTH_OF_LASTROW_THIRD_COLUMN;
        for (int i = 0; i < TotalLength; i++) {
            if (i < WIDTH_OF_FIRST_COLUMN) {
                // Printing the first Bleue square
                System.out.print(DARBLUE);
            } else if (i >= WIDTH_OF_FIRST_COLUMN && i < (WIDTH_OF_FIRST_COLUMN + 3)) {
                // Printing the border between the first row beige and red square
                System.out.print("|");
            } else if (i >= (TotalLength - (WIDTH_OF_LASTROW_SECOND_COLUMN - 6))) {
                // Printing the Beige area
                System.out.print(BEIGE);
            }
        }
        // Last bits
        // Printing the border
        for (int i = 0; i<3; i++) {
            System.out.print("|");
        }
        // Printing the last square
        for (int i = 0; i<WIDTH_OF_LASTROW_THIRD_COLUMN; i++) {
            System.out.print(lastSquareColor);
        }
        System.out.println(" ");

    }

    private void printFirstRowOfLastGroupBlack()
    {
        int TotalLength = WIDTH_OF_FIRST_COLUMN + 3 + WIDTH_OF_LASTROW_SECOND_COLUMN + 3 + WIDTH_OF_LASTROW_THIRD_COLUMN;
        for (int i = 0; i < TotalLength; i++) {
            if (i < WIDTH_OF_FIRST_COLUMN) {
                // Printing the first Bleue square
                System.out.print(DARBLUE);
            } else if (i >= WIDTH_OF_FIRST_COLUMN && i < (WIDTH_OF_FIRST_COLUMN + 3)) {
                // Printing the border between the first row beige and red square
                System.out.print("|");
            } else if (i >= (TotalLength - (WIDTH_OF_LASTROW_SECOND_COLUMN - 6))) {
                // Printing the Beige area
                System.out.print(BEIGE);
            }
        }
        // Last bits
        // Printing the border
        for (int i = 0; i<3 + WIDTH_OF_LASTROW_THIRD_COLUMN; i++) {
            System.out.print("|");
        }
        System.out.println(" ");

    }

    private void printAllBlackRow()
    {
        int TotalLength = WIDTH_OF_FIRST_COLUMN + 3 + WIDTH_OF_SECOND_COLUMN;
        for (int i = 0; i < TotalLength; i++) {
                System.out.print("|");
        }
        System.out.println(" ");

    }

} 

