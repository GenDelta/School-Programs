import java.util.*;
public class Magic
{
    int n;
    Magic(int nx)
    {
        n=nx;
    }
    int sumofdigits(int x)
    {
        int sum=0;
        while(x!=0)
        {
            sum+=x%10;
            x/=10;
        } 
        return sum;
    }
    void IsMagic()
    {
        int num=n;
        while(num/10!=0)
        {
            num=sumofdigits(num);
            if(sumofdigits(num)==1)
            {
                System.out.println(n+" is a magic number");
            }
            else
            System.out.println(n+" is not a magic number");
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer");
        int no=sc.nextInt();
        Magic ob=new Magic(no);
        ob.IsMagic();
    }
}
