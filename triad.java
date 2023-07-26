import java.util.*;
class triad
{
   void main()
   {
       int i, j, k, m, n,p;
       String str="123456789";
       
       
       
       for(i=123;i<=321;i++)
    {
        m=i*2;
        n=i*3;
        String s=Integer.toString(i)+Integer.toString(m)+Integer.toString(n);
        char a[]=s.toCharArray();
        for(j=0;j<a.length-1;j++)
        {
            for(k=0;k<a.length-1-j;k++)
            {
                if(a[k]>a[k+1])
                {
                    char ch1=a[k]; 
                    a[k]=a[k+1];
                    a[k+1]=ch1;
                }
            }
        }
        String s1=new String(a);
        if(s1.compareTo(str)==0)
        {
            System.out.println(i+"\n"+m+"\n"+n);
        }
    }
    }
}
