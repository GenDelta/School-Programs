import java.util.*;
class test2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s);
        System.out.println("subs 2: "+s.substring(2));
        System.out.println("subc 2 5: "+s.substring(2,5));
    }
}