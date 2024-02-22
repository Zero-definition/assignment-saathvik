import java.util.Scanner;

public class Problem5 {

    public static float tax_calculation(float income)
    {   
        float temp=income;
        float tax=0;
        
        temp=income-250000;

        if(temp<0)
        System.out.println(0);
        else
        {
            if(temp<250000)
            {
                tax+=(temp/10);
            }
            else
            {
                tax+=25000;
                temp-=250000;
                if(temp<500000)
                {
                    tax+=temp/5;
                }
                else
                {
                    tax+=100000;
                    temp-=500000;
                    tax+=(temp/100)*30;
                }
            }
        }

        return(tax);
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the income:-");

            float income=sc.nextFloat();
            
            System.out.print("The tax to be paid is = "+tax_calculation(income));
        }
        
    }
}
