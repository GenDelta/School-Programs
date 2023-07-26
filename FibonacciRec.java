import java.util.*;
public class FibonacciRec
{
    public static int recursion(int n)
    {
        if(n == 0)
        {
            return 0;
	}
	if(n == 1 || n == 2)
	{
	    return 1;
	   }
	   return recursion(n-2) + recursion(n-1);
    }
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        FibonacciRec ob=new FibonacciRec();
	System.out.print("Fibonacci Series of "+n+" numbers: \n");
	for(int i = 0; i<n; i++)
	{
	    System.out.print(recursion(i) +" ");
	}
    }
}