public class Problem2 {
    private static final int WIDTH_OF_TEXT = 30;
    private static final String MYINITIAL_LAST = "C";

    public static void main(String[] args)
    {
        Problem2 problem = new Problem2();
        problem.printFirstRow();
        for (int i = 2; i <= 15; i++) {
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
        m = String.format("MMMMM                    MMMMM");
        c = String.format("        CCCCCCCCCCCCCCCCCCCCCC");
        return new Initial(m, c);
    }


    public Initial formatSecondRow()
    {
        String template = "%0" + WIDTH_OF_TEXT + "d";
        String m; 
        String c;
        c = template;
        m = String.format("MMMMMMM                MMMMMMM");
        c = String.format("   CCCCCCCCCCCCCCCCCCCCCCCCCCC");
        return new Initial(m, c);
    }

    public Initial formatThirdRow()
    {
        String template = "%0" + WIDTH_OF_TEXT + "d";
        String m; 
        String c;
        c = template;
        m = String.format("MMM  MMM              MMM  MMM");
        c = String.format("CCCCCCCCCCC                   ");
        return new Initial(m, c);
    }

    public Initial formatFourthRow()
    {
        String template = "%0" + WIDTH_OF_TEXT + "d";
        String m; 
        String c;
        c = template;
        m = String.format("MMM   MMM            MMM   MMM");
        c = String.format("CCCC                          ");
        return new Initial(m, c);
    }

    public Initial formatSixthRow()
    {
        String template = "%0" + WIDTH_OF_TEXT + "d";
        String m; 
        String c;
        c = template;
        m = String.format("MMM    MMM          MMM    MMM");
        c = String.format("CCCC                          ");
        return new Initial(m, c);
    }

    public Initial formatNinthRow()
    {
        String template = "%0" + WIDTH_OF_TEXT + "d";
        String m; 
        String c;
        c = template;
        m = String.format("MMM     MMM        MMM     MMM");
        c = String.format("CCCCCCCCCCC                   ");
        return new Initial(m, c);
    }

    public Initial formatTenthRow()
    {
        String template = "%0" + WIDTH_OF_TEXT + "d";
        String m; 
        String c;
        c = template;
        m = String.format("MMM       MMM    MMM       MMM");
        c = String.format("   CCCCCCCCCCCCCCCCCCCCCCCCCCC");
        return new Initial(m, c);
    }

    public Initial formatEleventhRow()
    {
        String template = "%0" + WIDTH_OF_TEXT + "d";
        String m; 
        String c;
        c = template;
        m = String.format("MMM         MMMMMM         MMM");
        c = String.format("        CCCCCCCCCCCCCCCCCCCCCC");
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
        } else if (numRow == 4 || numRow == 5) {
            initial = formatFourthRow(); 
        } else if (numRow == 6 || numRow == 7) {
            initial = formatSixthRow(); 
        } else if (numRow == 9) {
            initial = formatNinthRow(); 
        } else if (numRow == 10) {
            initial = formatTenthRow(); 
        } else if (numRow == 11) {
            initial = formatEleventhRow(); 
        }



        if (initial.m != null) {
            System.out.printf("\t%s\t\t%s\n", initial.m, initial.c);
        }
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

