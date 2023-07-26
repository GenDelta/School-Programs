import java.util.*;
public class DDA_Fill
{
    public static void main()
    {
        System.out.println("Enter value of N");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N<2 || N>10)
        {
            System.out.println("Invalid input. N must be greater than 2 and less than 10");
            System.exit(0);
        }
        int a[] = new int[N];
        int b[][]=new int[N][N];
        System.out.println("Enter the values of a[][]:");
        for(int i=0;i<N;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("\n\nUnsorted a[][]:");
        for(int i=0;i<N;i++)
        {
            System.out.print(a[i]+ " ");
        }
        System.out.println("\n\nSorted a[][]:");
        for(int i=0;i<N-1;i++)
        {
            for(int j=0;j<N-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(int i=0;i<N;i++)
        {
            System.out.print(a[i]+" ");
        }
        int i,j,k;
        for(i=0;i<N;i++)
        {
            for(j=0;j<N-i;j++)
            {
                b[i][j]=a[j];
            }
            for(k=j;k<N;k++)
            {
                b[i][k]=a[k-j];
            }
        }
        System.out.println("\n\nb[][]:");
        for(i=0;i<N;i++) 
        {
            for(j=0;j<N;j++) 
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
