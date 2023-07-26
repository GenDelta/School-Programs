import java.util.*;
public class PrimeCheckRec 
{
	public static int check(int i,int num)
	{
	    if(num==i)
	        return 0;
	    else
	        if(num%i==0)
	            return 1;
	    else{
	        return check(i+1,num);
	    }
	}
	public static void main() 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number:");
	    int num=sc.nextInt();
	    if(check(2,num)==0)
	    System.out.print(num+" is a Prime Number.");
	    else
	    System.out.print(num+" is not a Prime Number.");
	}
}