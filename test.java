import java.util.*;
public class test 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of M");
        int M=sc.nextInt();
        while(true)
        {
            if(M<2 || M>8)
            {
                System.out.println("The value of M must be >2 and <8");
                M=sc.nextInt();
            }
            else
            {
                break;
            }
        }
        System.out.println("Enter the value of N");
        int N=sc.nextInt();
        while(true)
        {
            if(N<2 || N>8)
            {
                System.out.println("The value of M must be >2 and <8");
                N=sc.nextInt();
            }
            else
            {
                break;
            }
        }
        int a[][]=new int[M][N];
        System.out.println("Enter the elements of the matrix");
        int i,j,k;
        for(i=0;i<M;i++)
        {
            for(j=0;j<N;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix");
        for(i=0;i<M;i++)
        {
            for(j=0;j<N;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Output Matrix");
        for(i=M-1;i>=0;i--)
        {
            for(j=0;j<N;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for ( i = 0; i < N; i++) 
            {
            for ( j = 0; j < M - 1; j++) 
            {
                for ( k = 0; k < M - j - 1; k++) 
                {
                    if (a[k][i] > a[k+1][i]) 
                    {
                        int t = a[k][i];
                        a[k][i] = a[k+1][i];
                        a[k+1][i] = t;
                    }
                }
            }
         }
        System.out.println("Matrix with sorted columns");
        for(i=0;i<M;i++)
        {
            for(j=0;j<N;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0;i<M;i++)
        {
            System.out.println("The largest in column "+(i+1)+" = "+a[M-1][i]);
        }
    }
}
//36 42 90 78 69 27 26 41 56