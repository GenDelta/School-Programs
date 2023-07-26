/*
A rotation matrix rotating a point counter clockwise through 90 degrees is given by :

0      1
−1    0

Write a program to take as input the co ordinates of  point and give as output the co ordinates of the rotated point.
*/
import java.util.*;
public class coordrotation
{
  static double a[]={0,0};static double r[][]={{0,-1},{1,0}};static double c[]={0,0};
  public static void Rotate()
  {
      int i;int j;
      for(i=0;i<2;i++)
      {
          for(j=0;j<2;j++)
          {
              c[i]+=a[j]*r[i][j];
          }
      }
  }
  public static void main()
  {
      int i;double x;double y;
      Scanner sc=new Scanner(System.in);
      System.out.println("\nEnter the x-coordinate:");
      x=sc.nextDouble();
      System.out.println("Enter the y-coordinate:");
      y=sc.nextDouble();
      a[0]=x;
      a[1]=y;
      System.out.println("Initial coordinates");
      for(i=0;i<2;i++)
      {
          System.out.print(a[i]+" "); 
      }
      Rotate();
      System.out.println("\nFinal coordinates");
      for(i=0;i<2;i++)
      {
          System.out.print(c[i]+" ");
      }
  }
}
/* OUTPUT:
Enter the x-coordinate:
2
Enter the y-coordinate:
3
Initial coordinates
2.0 3.0 
Final coordinates
-3.0 2.0
*/

