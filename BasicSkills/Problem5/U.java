import java.util.Scanner;
public class U
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number:  ");
        int number = keyboard.nextInt();
        while (number < 100 && number > 500)
        {
            System.out.print("Enter another number:  ");
            number = keyboard.nextInt();
        }

        System.exit(0);
    }

}