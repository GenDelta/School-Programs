import java.io.*;
import java.util.*;
 class conversionrec
{
    static int findbin(int decimal_number)
    {
        if (decimal_number == 0)
            return 0;
        else
        return (decimal_number % 2 + 10 *findbin(decimal_number / 2));
    }
    static int findoct(int decimal_number)
    {
        if (decimal_number == 0)
            return 0;
        else
        return (decimal_number % 8 + 10 *findoct(decimal_number / 8));
    }
    static String findhex(int decimal_number)
    {
        char a[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
    String hex="";
        while (decimal_number != 0)
        {
            rem=decimal_number%16;
        hex= a[rem] + hex;
        decimal_number= decimal_number/16;
        findhex(decimal_number); 
        } 
    return hex;
        /*else
        {
            return (Integer.toString(0));
        }*/
    }
    public static void main()
    {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int decimal_number= sc.nextInt();
        System.out.println("Binary: "+ findbin(decimal_number));
        System.out.println("Octal: "+findoct(decimal_number));
        System.out.println("Hexadecimal: "+findhex(decimal_number));
    }
 }
 