import java.util.*;
class stn
{
    public static void main(String sent)
    {
       StringTokenizer str=new StringTokenizer(sent,"   . ,?!");
       int c=str.countTokens();
       String st[]=new String[c];
       for (int i=1;i<=c;i++)
        {
            String w=str.nextToken();
            st[i-1]=w;
        }
        for (int i=0;i<c-1;i++)
        {
            for (int j=0;j<c-1-i;j++)
            {
                if (st[j].compareToIgnoreCase(st[j+1])>0)
                {
                    String temp=st[j]; st[j]=st[j+1];st[j+1]=temp;
                }
            }
        }
        for (int i=0;i<c;i++)
        {
            System.out.print(st[i]+" ");
        }
        }
    }
        
       
        
    
