import java.util.*;
class change 
{
    int n, dec[]; long bin[];
    static Scanner sc=new Scanner(System.in);
    public void getdata()
    {
        System.out.println("Enter the capaity of the array:\n");
        n=sc.nextInt();
        dec=new int[n];
        bin=new long[n];
    }
    public void inputdecimals()
    {
        System.out.println("Enter the decimal numbers");
        for(int i=0;i<n;i++)
        {
            dec[i]=sc.nextInt();
        }
    }
    public void inputbinary()
    {
        System.out.println("Enter the binary numbers");
        for(int i=0;i<n;i++)
        {
            bin[i]=sc.nextLong();
        }
    }
    public void decimaltobinary()
    {
        String st="";
        for(int i=0;i<n;i++)
        {
            int no=dec[i];
            while(no!=0)
            {
                int r=no%2;
                st=r+st;
                no=no/2;
            }
            System.out.println(dec[i]+"\t"+st);
        }
        }
    public void binarytodecimal()
    {
        for(int i=0;i<n;i++)
        {
         String st=Long.toString(bin[i]);
         int res=0; int l=st.length();int p=0;
         for(int j=l-1;j<=0;j--)
         {
             char c=st.charAt(j);
             if(c=='1')
             {
                 res=res+1*(int)(Math.pow(2,p++));
                }
                else
                 p++;
            }
            System.out.println(bin[i]+"\t"+res);
        }
    }
    public static void main()
    {
        change obj=new change();
        obj.getdata();
        obj.inputdecimals();
        obj.inputbinary();
        obj.decimaltobinary();
        obj.binarytodecimal();
    }
}