import java.util.Scanner;

public class Problem9 {
    
    public int sum(int n)
    {
        int sum=n%10;
        n/=10;
        sum+=n;
        return(sum);
    }

    public int product(int n)
    {
        int sum=n%10;
        n/=10;
        sum*=n;
        return(sum);
    }

    public int digits(int n)
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
    public static String is_special(int n)
    {

        Problem9 ob=new Problem9();
        
        int digits=ob.digits(n);

        if(digits==2)
        {
            if(ob.sum(n)+ob.product(n)==n)
            return("Is a special integer");
            else
            return("Is not a special integer");
        }
        else
        {
            return("Is not a special integer");
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number :-");
            int n=sc.nextInt();

            System.out.println(is_special(n));
        }

        // object of different class can be used to solve this question
        //Problem1 obj1 = new digits();

    }
}
