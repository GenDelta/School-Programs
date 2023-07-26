import java.util.*;
public class dectobinREC
{
    public static int conv(int n)
    {
        if (n==0)
        return 0;
        else
        return n%2+10*(conv(n/2));
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int num=sc.nextInt();
        System.out.println("The binary equivalent of the decimal number ("+num+")10 is = " + "(" +conv(num)+")2");
    }
}