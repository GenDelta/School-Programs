import java.util.*; 
 public class check 
 {
     static int x=0; 
     static int y=0; 
     void accept() 

    {
        Scanner sc= new Scanner(System.in); 

        System.out.println("Enter 2 integers:"); 

         x= sc.nextInt(); 

         y=sc.nextInt(); 

    } 
    int count(int num) 
    {
        int c=0; 
        for(int i=1;i<=num;i++)
        { 
            if(num%i==0)
            c++;
        }
        return c;
    }
    void check()
    {
        int c1=count(x); int c2=count(y);
        if(c1==2&&c2==2)
        if(x-y==2||x-y==-2)
        System.out.println("They are twin prime.");
        else System.out.println("They are not twin prime.");
        else System.out.println("At least one of the numbers is not a prime number.");
    } 
    static void main() 
    {
        check obj=new check();
        obj.accept();
        obj.check(); 
    } 
} 