import java.util.Scanner;

public class Problem4 {
    public static float median(float[] n)
    {
        int l=n.length;
        if(l%2==0)
        {
            float median=((n[l/2]+n[l/2-1])/2)*10;
            median=Math.round(median);
            return(median/10);//multiplying and dividing with 10 to retain the tenths place 
        }
        return(n[l/2]); 
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of values in the array :- ");
            int l=sc.nextInt();

            if(l==0)
            {
                System.out.println("Error size is 0");
            }
            else
            {
                float[] n=new float[l];

                for(int i=0;i<l;i++)
                {
                    n[i]=sc.nextFloat();
                }

                System.out.println("The median of the array = "+median(n));
            }
        }
    }
}
