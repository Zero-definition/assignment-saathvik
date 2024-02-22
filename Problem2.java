import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem2 {

    public static double gross_price(double net_price,double tax_rate)
    {
        double gross_price=net_price/(tax_rate+1);
        return(gross_price);
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the net price:- ");
            double net_price=sc.nextFloat();
            System.out.println("Enter the tax rate:-");
            double tax_rate=sc.nextFloat();

            DecimalFormat df = new DecimalFormat("#.##");

            System.out.println(df.format(gross_price(net_price, tax_rate)));
        }

    }
}
