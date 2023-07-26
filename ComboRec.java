 import java.util.*;
public class ComboRec
{
    public static int fact(int n)
    {
        if(n==0)
        return 1;
        else
        return(n*fact(n-1));
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println("Enter the value of r:");
        int r=sc.nextInt();
        ComboRec ob=new ComboRec();
        int a=ob.fact(n);
        while(true)
        {
            if(r>n)
            {
                System.out.println("Enter the value of r again! It must be smaller than n");
                r=sc.nextInt();
            }
            else
            break;
        }
        int b=ob.fact(r);
        int c=ob.fact(n-r);
        long C=a/(b*c);
        System.out.println("C= "+C);
    }
}