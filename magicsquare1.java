import java.util.*;
public class magicsquare1
{
    public static void main()
    {
        int n,r=0,c=0,x=1,i=0,j=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n, it must be odd");
        n=sc.nextInt();
        int a[][]=new int[n][n];
        c=(n-1)/2;
        while(x<=n*n)
        {
            if(r==-1)
            r=n-1;
            if(c==-1)
            c=n-1;
            if(a[r][c]!=0)
            {
                a[i][j]=x;
                x++;
                r=i-1;
                c=j-1;
                continue;
            }
            a[r][c]=x;
            i=r+1;
            j=c;
            x++;
            r--;
            c--;
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}