import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
public class dt 
{    
    public static void main()
  {    
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");  
   LocalDateTime now = LocalDateTime.now();  
   String ddMMYYYY=dtf.format(now);
   int date = Integer.parseInt(ddMMYYYY.substring(0,2));
   int month = Integer.parseInt(ddMMYYYY.substring(3,5));
   int year = Integer.parseInt(ddMMYYYY.substring(6));
   System.out.println(date+"/"+month+"/"+year);
  }    
}    