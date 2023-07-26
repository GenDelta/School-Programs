import java.util.*;
public class decitoany
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int inputNumber=sc.nextInt();
        int copyOfInputNumber=inputNumber;
        int n=inputNumber;
        int n2=inputNumber;
        String binary="", octal="", hexa="";
        int rem1=0, rem2=0, rem3=0;
        char hexaDecimals[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while (inputNumber > 0)
        {
            rem1 = inputNumber % 2;
             
            binary =  rem1 + binary;
             
            inputNumber = inputNumber/2;
        }
         
        System.out.println("Binary Equivalent of "+copyOfInputNumber+" is "+binary);
       
        while (n > 0)
        {
            rem2 = n%8;
             
            octal =  rem2 + octal;
             
            n = n/8;
        }
         
        System.out.println("Octal Equivalent of "+copyOfInputNumber+" is "+octal);
        
        while (n2 > 0)
        {
            rem3 = n2%16;
             
            hexa =  hexaDecimals[rem3] + hexa;
             
            n2 = n2/16;
        }
         
        System.out.println("HexaDecimal Equivalent of "+copyOfInputNumber+" is "+hexa);
    }
}