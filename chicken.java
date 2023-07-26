import java.util.*;
public class chicken
{
    public static void main()
    {
        int n, i, j, k, p, m=3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of chickens:");
        n=sc.nextInt();
        p=m+2;
        if(p>=(n-p+m))
        {
            System.out.println("No way");
        }
        else
        {
            for(i=m;i<=n/2;i+=2)
            {
                for(j=i+2;j<n;j+=2)
                {
                    for(k=j+2;k<n;k+=2)
                    {
                        if((i+j+k)==n)
                        {
                            System.out.println(i+" "+j+" "+k);
                        }
                    }
                }
            }
        }
    }
}