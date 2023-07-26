public class kejane6
{
    public static void main()
    {
        int i=1;
        do{
            if(i==rev(i))
            {
                System.out.println(i);
            }
            i++;
        }
        while(i<=10000);
    }
    public static int rev(int n)
    {
        int r=0;
        while(n != 0) 
        {
            int digit = n % 10;
            r = r * 10 + digit;
            n /= 10;
        }
        return r;
    }
}