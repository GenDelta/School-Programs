import java.util.*;
public class antiSpiral
{
  public static void main()
  {
    int i;int j;int o;int c=1;int n=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the order of the matrix");
    o=sc.nextInt();
    int a[][]=new int[o][o];
    while(c<=o*o)
    {
      for(j=n;j<o-n;j++)
      {
          a[j][n]=c++;
      }
      for(i=n+1;i<o-n;i++)
      {
          a[o-n-1][i]=c++;
      }
      for(j=o-n-2;j>n;j--)
      {
          a[j][o-n-1]=c++;
      }
      for(i=o-n-1;i>n;i--)
      {
          a[n][i]=c++;
      }
      n++;
    }
    System.out.println("\nThe anti-clockwise spiral matrix is:\n");
    for(i=0;i<o;i++)
    {
       for(j=0;j<o;j++)
       {
           System.out.print(a[i][j]+" ");
       }
       System.out.println();
    }
   }
 }