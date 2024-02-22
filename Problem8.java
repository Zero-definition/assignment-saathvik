import java.util.Scanner;

public class Problem8 {
    public static String seconds_conversion(int seconds)
    {
        int minutes=seconds/60;
        seconds%=60;

        int hours=minutes/60;
        minutes%=60;

        int days=hours/24;
        hours%=24;

        return(days+" Day(s) "+hours+" Hour(s) "+minutes+" Minute(s) "+seconds+" Second(s)");
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of seconds :- ");
            int seconds = sc.nextInt();

            System.out.println(seconds_conversion(seconds));
        }
    }
}
