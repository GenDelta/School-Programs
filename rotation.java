import java.util.*;
public class rotation
{
  static double a[]={0,0};static double r[][]={{0,-1},{1,0}};static double t[]={0,0};
  public static void Rotate()
  {
      int i;int j;
      for(i=0;i<2;i++)
      {
          for(j=0;j<2;j++)
          {
              t[i]+=a[j]*r[i][j];
          }
      }
  }
  public static void main()
  {
      int i;double x;double y;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the x-coordinate and the y-coordinate");
      x=sc.nextDouble();
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
          System.out.print(t[i]+" ");
      }
  }
}