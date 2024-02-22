import java.util.Scanner;

public class Problem7 {
    public static int inflation(int year,double inflation_rate)
    {
        inflation_rate=1+inflation_rate/100;

        double compound_inflation=Math.pow(inflation_rate,year)-1;
        compound_inflation*=100;
        compound_inflation=Math.round(compound_inflation);

        return((int)compound_inflation); 
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter inflation rate:-");
            double inflation_rate=sc.nextInt();
            System.out.println("Enter number of years:-");
            int years=sc.nextInt();

            System.out.println("Compounded inflation is "+inflation(years, inflation_rate) );
        }
    }
}
