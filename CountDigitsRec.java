import java.util.*;
public class CountDigitsRec 
{
    public static int count(long n)
    {
        if (n/10 == 0)
            return 1;
        return 1 + count(n / 10);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        long n=sc.nextLong();
        System.out.println("Number of digits : "+ count(n));
    }
}