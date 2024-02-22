import java.util.Scanner;

public class Problem3 {

    public static int greater(int a,int b)
    {
        if(a>b)
        return(a);
        
        return(b);
    }

    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number:-");
            int a=sc.nextInt();

            System.out.println("Enter the second number:-");
            int b=sc.nextInt();

            System.out.print("The greater number is = "+greater(a,b));
        }
        
    }
}
