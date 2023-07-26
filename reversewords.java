import java.util.*;
public class reversewords
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine();
        StringTokenizer st=new StringTokenizer(s," . ,?!");
        int c=st.countTokens();
        for(int i=0;i<c;i++)
        {
            String wrd=st.nextToken();
            System.out.print(" " + rev(wrd) +" ");
        }
    }
    static String rev(String w)
    {
        char c[]=w.toCharArray();
        String r=" ";
        for(int i=w.length()-1;i>=0;i--)
        {
            r=r+c[i];
        }
        return r;
    }
}