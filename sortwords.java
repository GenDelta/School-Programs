import java.util.*;
public class sortwords
{
    public static void main()
    {
        String a[] = new String[5];
        System.out.println("\n\nEnter 5 words");
        Scanner sc=new Scanner(System.in);
        
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextLine();
        }
        
        System.out.println("\n\nUnsorted Array");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+", ");
        }
        
        System.out.println("\n\nSorted Array");
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j].compareTo(a[j+1])>0)
                {
                 String t=a[j];
                 a[j]=a[j+1];
                 a[j+1]=t;
            }
    }
}

for(int i=0;i<10;i++)
{
    System.out.print(a[i]+", ");
}
}
}