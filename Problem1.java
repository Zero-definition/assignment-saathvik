import java.util.Scanner;


public class Problem1 {

    public static int countDigits(int n)
    {
        if(n<0)
        n*=-1;
        int c=0;
        while(n>10)
        {
            c++;
            n/=10;
        }
        c++;

        return(c);
    }
    
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number:-");
            int n=sc.nextInt();
            
            System.out.println("Number of digits in the number = "+countDigits(n));
        }
    }
}