import java.util.*;                             
public class columnsort                                                                                      
{
     public static void main()
    {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter no. of rows:\n");
         int r=sc.nextInt();
         System.out.print("Enter no. of columns:\n");
         int c=sc.nextInt();
         int a[][]=new int[r][c];
         System.out.println("Enter elements for matrix:\n");
         for (int i=0;i<r;i++)
         {
             System.out.println("Enter the element for row number="+(i+1));
             for (int j=0;j<c;j++)
             {
                  a[i][j]=sc.nextInt();
                }
            }
            System.out.println();
            System.out.println("Original Matrix:");
            for (int i = 0; i < r; i++) 
            {
            for (int j = 0; j < c; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
           }
            for (int i = 0; i < c; i++) 
            {
            for (int j = 0; j < r - 1; j++) 
            {
                for (int k = 0; k < r - j - 1; k++) 
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
        System.out.println("Matrix after sorting columns:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
            }
        }
    }