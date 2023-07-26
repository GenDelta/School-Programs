import java.util.*;
public class NumberPrg
{
    public static void main(String args[])
    {
        String s[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        int n,num,sum=0,d;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        
        num=n;
        
        while(num!=0)
        {
        d=num%10;
        sum=sum*10+d;
        num=num/10;
    }
    while(sum!=0)
    {
        d=sum%10;
        System.out.print(s[d]+" ");
        sum=sum/10;
    }
}
}