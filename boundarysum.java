import java.util.*;                             
public class boundarysum                                                                                      
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
            int sum=0;
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                {
                    if (i==0||j==0||i==c-1||j==c-1)
                    {
                        sum = sum + a[i][j];
                    }
                }
                System.out.println("");
            }
            System.out.print("Sum of boundary is\t"+sum);
        }
    }