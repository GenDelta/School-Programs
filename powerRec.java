import java.util.*;
class powerRec
{
    public static double power(int m,int n)
    {
        if(n!=0) 
        {
            return(m*power(m,n-1));
        }
        return 1;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m=0,n=2;
        System.out.println("Enter value of m");
        m=sc.nextInt();
        System.out.println("Enter value of n");
        n=sc.nextInt();
        if(n<2)
        n=2;
        System.out.println("Result = "+power(m,n));
    }
}
