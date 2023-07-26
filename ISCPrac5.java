import java.util.*;
public class ISCPrac5
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number from 1 to 25:");
        int n;
        while(true)
        {
            n=sc.nextInt();
            if(n<1 || n>25)
            {
                System.out.println("Invalid input. Enter the value of n again:");
                continue;
            }
            else 
            break;
        }
        System.out.println("Enter a string");
        String s=sc.next()+sc.nextLine();
        int l=s.length();
        System.out.println(l);
        String res="";
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            res=res+ch;
            if(ch>='A'&&ch<='Z')
            {
                ch=(char)(ch+n);
                if(ch>'Z')
                {
                    ch=(char)(ch-n);
                    int diff='Z'-ch;
                    ch=(char)('A'+n-(diff+1));
                }
            }
            if(ch>='a'&& ch<='z')
            {
                ch=(char)(ch+n);
                if(ch>'z')
                {
                    ch=(char)(ch-n);
                    int diff='z'-ch;
                    ch=(char)('a'+n-(diff+1));
                }
            }
            res=res+ch;
        }
        System.out.println(res);
    }
}
