import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.text.ParseException;

public class Cashier
{
    public Cashier()
    {
        double price;
        double discountedPrice;
        price = getPrice();
        if (price < 128) {
            discountedPrice = price - (price * 0.08);
            JOptionPane.showMessageDialog(null, "Price : $" + price +
                    "\nDiscount: 8% : " +
                    "$" + price * 0.08 + "\nThe discounted price is: $" + discountedPrice);
        } else {
            discountedPrice = price - (price * 0.16);
            JOptionPane.showMessageDialog(null, "Price : $" + price +
                    "\nDiscount: 16% : " +
                    "$" + price * 0.16 + "\nThe discounted price is: $" + discountedPrice);
        }
    }

    private double getPrice()
    {
        String input;
        double price = 0.0;

        NumberFormat nf = NumberFormat.getInstance();
        while (price == 0.0) {
            input = JOptionPane.showInputDialog("Enter the price.");
            try {
                price = nf.parse(input).doubleValue();
            } catch (ParseException ex) {

            }
        }

        return price;
    }
}