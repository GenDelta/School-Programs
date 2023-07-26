import java.util.*;
public class ArrSumRec 
{
    static int fSum(int arr[], int n)
    {
        if (n <= 0)
            return 0;
        return (fSum(arr, n - 1) + arr[n - 1]);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements to be taken as input:");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(fSum(arr, n));
    }
}