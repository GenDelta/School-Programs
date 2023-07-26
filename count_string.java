import java.util.*;

public class count_string
{int count(String x)
    {
    if(x.length()<3)
    return 0;
      else
      {if(x.substring(0,3).equalsIgnoreCase("ABC"))
      
         return (1+count(x.substring(3)));
       
        
        else
        return(count(x.substring(1)));
    }}
  String remove(String x)
  {
      if(x.length()<3)
      return "";
      else
      {if(x.substring(0,3).equalsIgnoreCase("ABC"))
          return(remove(x.substring(3)));
          else
          return(x.charAt(0)+remove(x.substring(1)));
    }}
    

public static void main()
{Scanner sc=new Scanner(System.in);
  System.out.println("Enter x");
  String x=sc.next();
  count_string ob=new count_string();
  System.out.println(ob.count(x));
  System.out.println("The string with abc removed is "+ob.remove(x));
    }
}