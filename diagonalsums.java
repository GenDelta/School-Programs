import java.util.*;
class diagonalsums
{
    public static void main()
    {
        int d1=0, d2=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows:\n");
        int r=sc.nextInt();
        System.out.print("Enter no. of columns:\n");
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        if(r==c)
       {
            System.out.println("Enter elements for matrix:\n");
         for (int i=0;i<r;i++)
         {
             System.out.println("Enter the element for row number="+(i+1));
             for (int j=0;j<c;j++)
             {
                  a[i][j]=sc.nextInt();
                }
         }
         for (int i = 0; i < c; i++) 
         {
            for (int j = 0; j < c; j++) 
            {
                if (i == j)
                    d1+= a[i][j];
                if ((i + j) == (c - 1))
                    d2 += a[i][j];
            }
         }
         System.out.println("Principal Diagonal:"+ d1);
         System.out.println("Secondary Diagonal:"+ d2);
       }
       else
       System.out.println("The input must be a square matrix. Try again.");
    }
}
