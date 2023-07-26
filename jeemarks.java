import java.util.*;
public class jeemarks 
{
    public static void main() {
        Scanner sc=new Scanner(System.in);
        int i=0; String correctid[]=new String[25]; String myid[]=new String[25]; 
        System.out.println("Enter the correct ID's");
        String s=sc.nextLine();
        correctid=s.split(" ");
        System.out.println("Enter the ID's of your options:");
        String s1=sc.nextLine();
        myid=s1.split(" ");
        int sum=0;
        for(i=0;i<25;i++)
        {
            if(correctid[i].equals(myid[i]))
            {
                sum=sum+4;System.out.println("+4");
            }
            if(!correctid[i].equals(myid[i]))
            {
                sum=sum-1;System.out.println("-1");
            }
            if(myid[i].equals("0"))
            {
                sum=sum+0;
            }
        }
        System.out.println("Marks= "+ sum);
    }
}