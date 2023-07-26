import java.util.*;
public class areaoverload
{
    public double area(double S)
    {
        double A= 1.732/4*S*S;
        return A;
    }
    public double area(double S, double H)
    {
        double A=0.5*S*H;
        return A;
    }
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter 1 for area of equilateral triangle \n Enter 2 for area of right angled triangle");
        int c=sc.nextInt();
        double a=0.0;
        switch(c)
        {
           case 1:
            System.out.println("Enter the length of one side of the equilateral triangle:");
            double s1=sc.nextInt();
            a=area(s1);
            System.out.println("Area of the equilateral triangle is="+a);
            break;
            case 2:
            System.out.println("Enter the length of height and base of the right angled triangle:");
            double l=sc.nextInt();
            double h=sc.nextInt();
            a=area(l,h);
            System.out.println("Area of the equilateral triangle is="+a);
            break;
            default:
            System.out.println("Wrong Choice. Try again.");
            break;
        }
    }
}