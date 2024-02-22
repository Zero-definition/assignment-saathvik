import java.util.Scanner;

public class Problem10 {
    public static int second_max(int[] n)
    {
        int l=n.length;
        int max=0,max2=0;

        for(int i=0;i<l;i++)
        {
            if(n[i]>max)
            {
                max2=max;
                max=n[i];
            }
            if(n[i]<max&&n[i]>max2)
            max2=n[i];
        }
        return(max2);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array:-");
            int l=sc.nextInt();

            int[] n=new int[l];

            System.out.println("Enter the values in the array:- ");

            for(int i=0;i<l;i++)
            {
                n[i]=sc.nextInt();
            }

            System.out.println("The second greatest number in the array ="+second_max(n));
        }
    }
}
