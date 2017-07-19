import java.lang.reflect.Field;
public class Problem4 {

    private static final double NewYork = 0.08875;
    private static final double California = 0.1025;
    private static final double Delaware = 0;
    private static final double Missouri = 0.04225;
    private static final double Alabama = 0.04;

    public static void main(String[] args)
    {
        Problem4 problem = new Problem4();
        problem.printHeader();
        problem.printStateTax("NewYork");
        problem.printStateTax("California");
        problem.printStateTax("Delaware");
        problem.printStateTax("Missouri");
        problem.printStateTax("Alabama");
    }

    private void printHeader()
    {
        System.out.println("Sales     Tax Rates");
        System.out.println(" ");
        System.out.println("===================");
        System.out.println(" ");
    }

    private void printStateTax(String state)
    {
        Double value = 0.000;
        try {
            Field f = this.getClass().getDeclaredField(state);
            f.setAccessible(true);
            value = (Double)f.get(this);
        } catch (NoSuchFieldException | IllegalAccessException ex) {

        }

        String output = String.format("%s:   %f %%", state, value * 100);
        System.out.println(output);
    }

} 

