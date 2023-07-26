import java.util.*;
class consecutiveseries
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int s=1;
        int e=(n+1)/2;
        System.out.println("The consective series numbers that add up to the given number are:");
        while (s<e)
        {
            int sum=0;
            for (int i=s; i<=e;i++)
            {
                sum=sum + i;
                if (sum==n)
                {
                    for (int j=s;j<=i;j++)
                    System.out.print(j+" ");
                    System.out.println();
                    break;
            }
            if (sum>n)
                break;
            }
            sum=0;
            s++;
        }
    }
}
