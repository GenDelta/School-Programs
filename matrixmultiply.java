import java.util.*;                             
public class matrixmultiply                                                                                      
{
    public static void main()
    {
         int i,j,k;
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter no. of rows of matrix A:\n");
         int r=sc.nextInt();
         System.out.print("Enter no. of columns of matrix A:\n");
         int c=sc.nextInt();
         int a[][]=new int[r][c];
         System.out.println("Enter elements for matrix A:\n");
         for ( i=0;i<r;i++)
         {
             System.out.println("Enter the element for row number="+(i+1));
             for ( j=0;j<c;j++)
             {
                  a[i][j]=sc.nextInt();
                }
         }
         System.out.print("Enter no. of rows for matrix B:\n");
         int m=sc.nextInt();
         System.out.print("Enter no. of columns for matrix B:\n");
         int n=sc.nextInt();
         int b[][]=new int[m][n];
         System.out.println("Enter elements for matrix B:\n");
         for ( i=0;i<m;i++)
         {
             System.out.println("Enter the element for row number="+(i+1));
             for ( j=0;j<n;j++)
             {
                  b[i][j]=sc.nextInt();
                }
         }
         int d[][]=new int[r][n];
         int sum=0;
         if(c!=m)
         {
             System.exit(0);
            }
            else
         for ( i = 0; i < r; i++)
         {
            for ( j = 0; j < n; j++)
            {  
               for (k = 0; k < m; k++)
               {
                  sum = sum + a[i][k]*b[k][j];
               }
               d[i][j] = sum;
               sum = 0;
            }
         }
         System.out.println("Product of the matrices:");
         for (i = 0; i < r; i++)
         {
            for (j = 0; j < n; j++)
               System.out.print(d[i][j]+"\t");
            System.out.print("\n");
         }
     }
}