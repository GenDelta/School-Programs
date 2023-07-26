import java.util.*;
public class equationsatis
{
    public static int satis(int p,int q, int r,int s)
    {
        int ret;
        int c1=p*p*p;
        int c2=q*q*q;
        int c3=r*r*r;
        int c4=s*s*s;
        int sum=c1+c2+c3;
        if(sum==c4)
        ret=0;
        else
        ret=-1;
        return ret;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        System.out.println("Enter the value of c");
        int c=sc.nextInt();
        System.out.println("Enter the value of d");
        int d=sc.nextInt();
        System.out.println("Result = " + satis(a,b,c,d));
    }
}