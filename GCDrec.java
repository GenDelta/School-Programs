import java.util.*;
public class GCDrec
{
    public int GCD(int n1,int n2)
    {
        if(n1==n2)
        return n1;
        else if(n1>n2)
        return GCD(n1-n2,n2);
        else  
        return GCD(n1,n2-n1);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1=sc.nextInt();
        System.out.println("Enter the second number");
        int n2=sc.nextInt();
        GCDrec ob=new GCDrec();
        int n=ob.GCD(n1,n2);
        System.out.println("The GCD is "+n);
    }
}