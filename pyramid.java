import java.util.*;
class pyramid
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int x=sc.nextInt();
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(a);
            }
            System.out.println();
        }
        for(int i=x-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
