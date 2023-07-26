import java.util.*;
public class BCD
  {
      public static void main()
      {
          int i;int j;double n;String s;int num;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a decimal number:");
          n=sc.nextDouble();
          s=Double.toString(n);
          for(i=0;i<s.length();i++)
          {
              if(Character.isDigit(s.charAt(i))==true)
              {
                  num=(int)s.charAt(i)-48;
                  for(j=8;j>=1;j=j/2)
                  {
                      System.out.print(num/j);
                      num%=j;
                    }
                }
                else
                System.out.print(s.charAt(i));
            }
        }
    }