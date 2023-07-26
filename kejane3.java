import java.util.*;
public class kejane3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        double sum=0;
        String s="0.5";
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                sum+=0.5;
            }
            else
            {
                String s1=s+"5";
                double t=Double.parseDouble(s1);
                sum+=t;
                s=s1;
            }
        }
        System.out.println("Sum= "+sum);
    }
}