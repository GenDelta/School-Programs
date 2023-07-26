import java.util.*;
public class letterpatternABBCCCDDDDEEEEEToN
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        int i,j;
        if(n>26)
        {
            System.out.println("The value of N should be less than 26. Try again next time.");
        }
            else
            {
        for(i=65; i<=n+64;i++)
        {
            for(j=65;j<=i;j++)
            {
                System.out.print((char)i);
            }
            System.out.println();
        }
        }
    }
}