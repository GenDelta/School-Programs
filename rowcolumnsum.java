import java.util.*;                             
public class rowcolumnsum                                                                                      
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
            int sumr=0,sumc=0;
            int rl=a.length;
            int cl=a[0].length;
            for(int i = 0; i < rl; i++)
            {  
            for(int j = 0; j < cl; j++)
            {    
              sumr= sumr + a[i][j];    
            }    
            System.out.println("Sum of " + (i+1) +" row: \t" + sumr);   
            sumr=0;
        }    
        for(int i = 0; i < cl; i++)
        { 
            for(int j = 0; j < rl; j++)
            {    
              sumc = sumc + a[j][i];    
            }    
            System.out.println("Sum of " + (i+1) +" column: " + sumc);  
            sumc=0;
        }    
        }
    }