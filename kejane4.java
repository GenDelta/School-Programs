import java.util.*;
public class kejane4
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        double sum=0;
        int j=2;
        String s="1";
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                sum+=1;
            }
            else
            {
                if(k==0){
                    String t=Integer.toString(j);
                    String t1="."+t;
                    String s1=s+t1;
                    double temp=Double.parseDouble(s1);
                    sum+=temp;
                    s=s1;
                    j++;
                    k=1;
                }
                else
                {
                    String t=Integer.toString(j);
                    String s1=s+t;
                    double temp=Double.parseDouble(s1);
                    sum+=temp;
                    s=s1;
                    j++;
                }
            }
        }
        System.out.println("Sum= "+sum);
    }
}