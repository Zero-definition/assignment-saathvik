import java.util.Scanner;

public class Problem6 {
    public static String max_vowels(String[] s)
    {
        int l=s.length;
        int max=0;
        int vowels_count=0;
        String maxs="";
        for(int i=0;i<l;i++)
        {
            vowels_count=0;
            int s_len=s[i].length();
            for(int j=0;j<s_len;j++)
            {
                switch(s[i].charAt(j))
                {
                    case 'a':
                    {
                        vowels_count++;
                        break;
                    }
                    case 'e':
                    {
                        vowels_count++;
                        break;
                    }
                    case 'i':
                    {
                        vowels_count++;
                        break;
                    }
                    case 'o':
                    {
                        vowels_count++;
                        break;
                    }
                    case 'u':
                    {
                        vowels_count++;
                        break;
                    }
                    default:
                    break;
                }
            }
            if(max<vowels_count)
            {
                maxs=s[i];
                max=vowels_count;
            }
        }
        return(maxs);
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of Strings in the array :- ");
            int l=sc.nextInt();
            
            //to consume the new line character 
            //this is only a problem when we are taking string inputs 
            sc.nextLine();

            String[] s=new String[l];

            System.out.println("Enter the strings in the array:-");
            for(int i=0;i<l;i++)
            {
                s[i]=sc.nextLine();
            }
            
            System.out.println("The String with maximum number of vowels is "+ max_vowels(s));
        }
    }
}
