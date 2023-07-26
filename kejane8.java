import java.util.*;
public class kejane8
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int i=0;
        System.out.println("Enter "+n+" numbers");
        int prod=1;
        while(i<n)
        {
            int t=sc.nextInt();
            prod*=t;
            i++;
        }
        System.out.println("Product= "+prod);
        int sum=0;
        while(prod!=0) 
        {
            int digit=prod%10;
            sum+=digit;
            prod/=10;
        }
        System.out.println("Sum= "+sum);
    }
}