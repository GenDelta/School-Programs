import java.util.*;
public class sortsearch
{
    static Scanner sc = new Scanner(System.in);
    int x[];
    int cap;
    int i;
   sortsearch(int n)
    {
        cap = n;
        x = new int[cap];
    }
    void input()//input the array elements
    {
System.out.println("Enter the elements of the array");
for(i = 0;i<cap;i++)
        {
            x[i] = sc.nextInt();
        }
    }
    void disp()//display the array
    {for (int i=0;i<cap;i++)
System.out.println(x[i]);
    }
    void selsort()//perform selection sort in ascending order
    {
        int i,j,min_idx,temp;
for(i = 0;i<cap-1;i++)
        {
min_idx = i;
for(j = i+1;j<cap;j++)
            {
                if(x[j]<x[min_idx])
                {
min_idx = j;
                }
            }
            temp = x[min_idx];
            x[min_idx] = x[i];
            x[i] = temp;
        }
    }
    int binarysearch(int el)// search the element el in the sorted array by binary searhmethod.return the postion of the array if its found otherwise return  -1
    {
int low=0,high=cap-1,f=0,mid=0;
  while(low<=high)
  {
         mid= (low + high)/2;
        if(el==x[mid])
        {f=1;
           break;
        }
        else
if(el> x[mid])
        {
            low = mid + 1;
            
        }
        else
        {
            high = mid - 1;
            
        }
    }
    if (f==0)//element not found
    return -1;
    else
    return mid+1;
}
    
    public static void main() // Accept no.elements accordingly declare the object.Display the array before and after sorting. Accept the elemet to be searched.Invokebinsearchandgie proper message according to the value returned
    {
System.out.println("Enter the no. of elements in the array");
  int num=sc.nextInt();
 sortsearch ob = new sortsearch(num);
  
  System.out.println("element to be searched using binary search");
        int element = sc.nextInt();

ob.input();
ob.selsort();
System.out.println("array after sorting");
ob.disp();
int res=ob.binarysearch(element);
if (res!=-1)
 System.out.println(element+ "is found in psition no="+ res);
 else
 System.out.println(element +"is not found");
    }
}
