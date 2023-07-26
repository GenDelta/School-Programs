import java.util.*;
public class ISCPrac4
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order of the matrix");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int b[]=new int[(2*n)+(2*(n-2))];
        int k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==0 || i==n-1 || j==n-1)
                {
                    b[k]=a[i][j];
                    k++;
                }
            }
        }
        for(int i=0;i<((2*n)+(2*(n-2)));i++)
        {
            for(int j=0;j<((2*n)+(2*(n-2)))-1-i;j++)
            {
                if(b[j]>b[j+1])
                {
                    int temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
        }
        k=0;
        int j=0;
        int i=0;
        for(i=0;i<n;i++)
        {
            a[j][i]=b[k];
            k++;
        }
        j++;
        for(i=j;i<n;i++)
        {
            a[i][n-j]=b[k]; //for MxN matrix: a[i][n-j]=b[k];
            k++;
        }
        j++;
        for(i=n-j;i>=0;i--)
        {
            a[n-1][i]=b[k];//for MxN matrix: a[m-1][i]=b[k];
            k++;
        }
        i--;
        for(i=n-j;i>0;i--)//for MxN matrix: for(i=m-j;i>0;i--)
        {
            a[i][0]=b[k];
            k++;
        }
        System.out.println("Final matrix:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}