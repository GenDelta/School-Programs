import java.util.*;
public class kejane7
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to display all the even numbers from 1 to 1000");
        System.out.println("Enter 2 to display all the odd numbers from 1 to 1000");
        System.out.println("Enter 3 to display all the numbers which are divisible by 5");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case '1':
                for(int i=1;i<=1000;i++)
                {
                    if(i%2==0)
                    {
                        System.out.println(i);
                    }
                }
                break;
            case '2':
                for(int i=1;i<=1000;i++)
                {
                    if(i%2!=0)
                    {
                        System.out.println(i);
                    }
                }
                break;
            case '3':
                for(int i=1;i<=1000;i++)
                {
                    if(i%5==0)
                    {
                        System.out.println(i);
                    }
                }
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
    }
}