public class Problem2 {
    private static final String MYINITIAL_FIRST = "M";
    private static final String MYINITIAL_LAST = "C";
    private static final int WIDTH_OF_TEXT = 20;
    private static final int HEIGHT_OF_TEXT = 20;

    public static void main(String[] args)
    {
        Problem2 problem = new Problem2();
        problem.printFirstRow();
        for (int i = 2; i <= 3; i++) {
            problem.printRow(i);
        }
    }

    public void printFirstRow()
    {
        Initial initial = formatFirstRow(); 
        System.out.printf("\t%s\t\t%s\n", initial.m, initial.c);
    }

    /**
     * @deprecated
     *
     */
    public Initial formatFirstRow()
    {
        String template = "%0" + WIDTH_OF_TEXT + "d";
        String m; 
        String c;
        m = template;
        c = template;
        m = String.format("MMMMM          MMMMM");
        c = String.format(c, 8).replaceAll("8", MYINITIAL_LAST).replaceAll("0", MYINITIAL_LAST);
        return new Initial(m, c);
    }

   /**
    * @deprecated
    *
    */
    public Initial formatFirstRowOld()
    {
        String template = "%0" + WIDTH_OF_TEXT + "d";
        String m; 
        String c;
        m = template;
        c = template;
        m = String.format(m, 8).replaceAll("8", MYINITIAL_FIRST).replaceAll("0", MYINITIAL_FIRST);
        c = String.format(c, 8).replaceAll("8", MYINITIAL_LAST).replaceAll("0", MYINITIAL_LAST);
        return new Initial(m, c);
    }

    public void printRow(int numRow)
    {
        // Empty struct
        Initial initial = new Initial();
        if (numRow == 1) {
            initial = formatFirstRow(); 
        } else if (numRow == 2) {
            initial = formatSecondRow(); 
        } else if (numRow == 3) {
            initial = formatThirdRow(); 
        }
        System.out.printf("\t%s\t\t%s\n", initial.m, initial.c);
    }

    public void printSecondRow()
    {
        printRow(2); 
    }

    public void printThirdRow()
    {
        printRow(3); 
    }

    public Initial formatSecondRow()
    {
        String template = "%0" + WIDTH_OF_TEXT + "d";
        String m; 
        String c;
        c = template;
        m = String.format("MMMMMMM    MMMMMMM");
        c = String.format(c, 8).replaceAll("8", MYINITIAL_LAST).replaceAll("0", MYINITIAL_LAST);
        return new Initial(m, c);
    }

    public Initial formatThirdRow()
    {
        String template = "%0" + WIDTH_OF_TEXT + "d";
        String m; 
        String c;
        c = template;
        m = String.format("MMM  MMM    MMM  MMM");
        c = String.format(c, 8).replaceAll("8", MYINITIAL_LAST).replaceAll("0", MYINITIAL_LAST);
        return new Initial(m, c);
    }

    /**
     * Struct Initial
     */
    private class Initial {
        String m;
        String c;

        public Initial() {}

        public Initial(String mi, String ci)
        {
            m = mi;
            c = ci;
        }
    }   
} 

