import java.util.*;
public class primefactors 
{
    int sz;
    int arr[];
    static Scanner sc=new Scanner(System.in);
    primefactors(int lim)
    {
        sz=lim; 
        arr= new int[sz];
    }
    void fill_array()
    {
        System.out.println("Enter the elements of the array");
        for(int i=0;i<sz;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    void showprime_factors()
    {
        for(int i = 0; i<sz; i++)
        {
            System.out.print(arr[i] + "     ");
            int n = arr[i];
            int k = n/2;
            for(int j = 2; j<=k; j++)
            {
                while(n%j==0)
                {
                    System.out.print(j+", ");
                    n=n/j;
                }
            }
            System.out.println(" ");
        }
    }
    public static void main()
    {
        System.out.println("Enter the number of numbers of the array.");
        int n = sc.nextInt();
        primefactors ob = new primefactors(n);
        ob.fill_array();
        ob.showprime_factors();
    }
}