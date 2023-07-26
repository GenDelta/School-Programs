import java.util.*;                             
public class matrixforms                                                                                      
{
    public static void main()
    {
         Scanner sc=new Scanner(System.in);
         int n=5;
         int a[][]=new int[n][n];
         System.out.println("Enter elements for the matrix:\n");
         for (int i=0;i<n;i++)
         {
             System.out.println("Enter the element for row number="+(i+1));
             for (int j=0;j<n;j++)
             {
                  a[i][j]=sc.nextInt();
                }
         }
         
    }
}