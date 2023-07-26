import java.util.*;
public class ISCPrac1
{
    public static void main()
    {
        System.out.println("Enter 3 characters:");
        Scanner sc=new Scanner(System.in);
        char []ch=new char[3];
        for(int i=0;i<3;i++)
        {
            ch[i]=sc.next().charAt(0);
        }
        System.out.println("Enter the order of the matrix");
        int N=sc.nextInt();
        char a[][]=new char[N][N];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                if((i==0 && j==0) || (i==0 && j==N-1) || (i==N-1 && j==0) || (i==N-1 && j==N-1))
                a[i][j]=ch[0];
                else if(i==0 || j==0 || i==N-1 || j==N-1)
                a[i][j]=ch[1];
                else
                a[i][j]=ch[2];
            }
        }
        System.out.println("Final array:");
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}