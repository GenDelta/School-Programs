import java.util.*;
public class Square
{
    int num=0;
    Square(int nu)
    { 
     num=nu;
    }
    public void perfectsquare()
    {
        int n=0; int c=0;
        for(int i=1;;i++)
        {
         n=i*i;
         if(n>num)
         {
             c++;
             if(c<=5)
             System.out.println(n);
             else
             break;
            }
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check for the next 5 perfect square numbers:");
        int no=sc.nextInt();
        Square ob= new Square(no);
        System.out.println("The first five perfect squares greater than "+no+" are:");
        ob.perfectsquare();
    }
}