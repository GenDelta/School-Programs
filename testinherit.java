import java.util.*;
public class testinherit
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name, age, phone no, fromcity, tocity, fare");
        String name=sc.nextLine();
        int age=sc.nextInt();
        long fone=sc.nextLong();
        String fc=sc.nextLine();
        String tc=sc.nextLine();
        double p=sc.nextDouble();
        Journey ob=new Journey(name,age,fone,fc,tc,p);
        ob.fnOutput();
    }
}