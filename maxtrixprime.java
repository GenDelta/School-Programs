/*Question :

Write a Program to declare a double dimensional matrix of order  M x N (2 < M,N < 20). Allow users to input integers into the matrix. Display appropriate error message for invalid input. Perform the following tasks (O/p should be pasted as comment line in the program) :

A. Display the original matrix.

B. Find and display the sum of all prime numbers in the matrix.

Example :

INPUT :

M = 20

OUTPUT :

Out of Range!

INPUT :

M = 3

N = 2

Out of Range!

INPUT :

M = 3

N = 3

4   5   7

12 13 11

3   8   10

OUTPUT :

Original Matrix :

4   5   7

12 13 11

3   8   10

Sum of all the primes = 39*/
import java.util.*;                             
public class maxtrixprime                                                                                      
{
    static boolean prime(int num)
    {
        int c = 0;
        for (int i = 1; i <= num; i++) 
        {
            if (num % i == 0)
                c = c + 1;
        }
        if (c == 2)
            return true;
        else
            return false;
        }
    public static void main()
    {
        int i,j,sum=0;
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter no. of rows:\n");
         int M=sc.nextInt();
         System.out.print("Enter no. of columns:\n");
         int N=sc.nextInt();
         if(M<2 || N<2)
         {
             System.out.println("Enter the values of M and N correctly next time. Both values should be greater than 2 and less than 20");
             System.exit(0);
         }
         if(M>20 || N>20)
         {
             System.out.println("Enter the values of M and N correctly next time. Both values should be greater than 2 and less than 20");
             System.exit(0);
         }
         int a[][]=new int[M][N];
         System.out.println("Enter elements for matrix:\n");
         for (i=0;i<M;i++)
         {
             System.out.println("Enter the element for row number="+(i+1));
             for (j=0;j<N;j++)
             {
                  a[i][j]=sc.nextInt();
                  if(prime(a[i][j]))
                  {
                      sum+=a[i][j];
                  }
             }
         }
         System.out.println("Original Matrix:");
         for(i=0;i<M;i++)
         {    
             for(j=0;j<N;j++)
             {    
                 System.out.print(a[i][j]+" ");    
             }    
             System.out.println();    
         }
         System.out.println("Sum of all primes ="+sum);
    }
}
/*Output
   Enter no. of rows:
1
Enter no. of columns:
1
Enter the values of M and N correctly next time. Both values should be greater than 2 and less than 20
Enter no. of rows:
21
Enter no. of columns:
21
Enter the values of M and N correctly next time. Both values should be greater than 2 and less than 20
Enter no. of rows:
3
Enter no. of columns:
3
Enter elements for matrix:

Enter the element for row number=1
1 2 3
Enter the element for row number=2
4 5 6
Enter the element for row number=3
7 8 9
Original Matrix:
1 2 3 
4 5 6 
7 8 9 
Sum of all primes =17*/