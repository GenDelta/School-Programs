import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
public class SecurityCheck
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the date of birth (dd)");
        int d= sc.nextInt();
        System.out.println("Enter the month of birth (mm)");
        int m= sc.nextInt();
        System.out.println("Enter the year of birth (yyyy)");
        int y= sc.nextInt();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");  
        LocalDateTime now = LocalDateTime.now();  
        String ddMMYYYY=dtf.format(now);
        int cy=Integer.parseInt(ddMMYYYY.substring(6));
        int cm=Integer.parseInt(ddMMYYYY.substring(3,5)); 
        int cd=Integer.parseInt(ddMMYYYY.substring(0,2));
        int a1=cy-y;
        if(a1>13)
        {
            System.out.println("Granted");
            System.exit(0);
        }
        else if (a1<13)
        {
        System.out.println("Denied");
        System.exit(0);
    }
        else
        {
            int a2=cm-m;
            if (a2>0)
            {
            System.out.println("Granted");
            System.exit(0);
        }
            if (a2<0)
            {
            System.out.println("Denied");
            System.exit(0);
        }
            else 
            {
                int a3=cd-d;
                if (a3<0)
                {
                System.out.println("Denied");
                System.exit(0);
            }
                else 
                {
                System.out.println("Granted");
                System.exit(0);
            }
            }
        }
    }
}