import java.util.*;
public class qConv
{
    public static int deci(int bin)
    {
        if(bin==0)
        return 0;
        else
        return (bin%10+2*deci(bin/10));
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number in binary");
        int b = sc.nextInt();
        System.out.println("Entered number in decimal: "+ deci(b));
    }
}