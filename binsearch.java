import java.util.*;
public class binsearch
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 numbers in the array:");
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Enter the number to be searched: ");
        int x=sc.nextInt();
        int l=a[0]; int u=a[4];
        int m=(l+u)/2;
        while(l<=u)
        {  
            if(a[m]<x)
            {  
                l=m+1;     
            }
            else if (a[m]==x)
            {  
                System.out.println("Element is found at index: "+m);  
                break;  
            }
            else
            {  
                l=m-1;  
            }  
            m=(l+u)/2;  
        }  
        if (l>u)
        {  
            System.out.println("Element is not found!");  
        }  
    }  
}