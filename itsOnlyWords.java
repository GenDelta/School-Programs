import java.util.*;
public class itsOnlyWords
{
    int numWords=0;
    String words[]=new String[numWords]; 
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of words in array");
        numWords=sc.nextInt();
        words=new String[numWords];
        System.out.println("Enter elements of array");
        for(int i=0;i<numWords;i++)
        {
            words[i]=sc.next();
        }
    }
    void display()
    {
        System.out.println("The unsorted array is");
        for(int i=0;i<numWords;i++)
        {
            System.out.println(words[i]);
        }
    }
    void selsort()
    {
        System.out.println("The sorted array is");
        for(int i = 0; i < numWords - 1; i++)
        {
            int ind = i;
            String str = words[i];
            for(int j = i + 1; j < numWords; j++)
            {
                if(words[j].compareTo(str) < 0)
                {
                    str = words[j];
                    ind = j;
                }
            }
            if(ind != i)
            {
                String temp = words[ind];
                words[ind] = words[i];
                words[i] = temp;
            }
        }
        for(int i=0;i<numWords;i++)
        {
            System.out.println(words[i]);
        }
    }
    void binSearch()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a searchable string");
        String x=sc.nextLine();

      int l = 0, z = numWords - 1,f=0;
        while (l <= z) 
        {
            int m = l + (z - l) / 2;
 
            int res = x.compareTo(words[m]);
 
            if (res == 0)
            {
                System.out.println(x+" found in position  "+ (m+1));
                f=1;
                break;
            }

 
            if (res > 0)
                l = m + 1;
 
            else
                z = m - 1;
        }
        if(f!=1)
        System.out.println(x+" is not present in the given Array");
   }
    public static void main()
    {
        itsOnlyWords ob=new itsOnlyWords();
        ob.input();
        ob.display();
        ob.selsort();
        ob.binSearch();
    }
}