import java.util.*;
public class SumRec
{
    public static int Sum(int n)
    {
        if (n <= 1)
            return n;
        return n + Sum(n - 1);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("The sum of "+n+" numbers is = "+Sum(n));
    }
}
 