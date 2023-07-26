import java.util.*;                             // 1 2 3
class ar2                                       // 4 5 6
                                                // 7 8 9
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no. of rows");
        int r=sc.nextInt();
         System.out.print("enter no. of columns");
         int c=sc.nextInt();
         int a[][]=new int[r][c];
         System.out.println("enter elements for matrix");
         for (int i=0;i<r;i++)
         {
             System.out.println("enter the element for row number="+(i+1));
             for (int j=0;j<c;j++)
             {
                  a[i][j]=sc.nextInt();
                }
            }
            System.out.println();
            int s=0;
        for (int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if ((i==j)||(i+j)==r-1)
                s=s+a[i][j];
            }
            System.out.println();
        }
        System.out.println(s);
    }
}

               
        
        
        
        