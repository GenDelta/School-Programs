import java.util.*;
public class dajjuagnivosting
{
    public static void main()
    {
        double p; double r; double t; double SI=0.0; double CI=0.0; double A=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 for SI and 2 for CI");
        int ch=sc.next().charAt(0);
        System.out.println("Enter values of pricipal, rate and time");
        p=sc.nextDouble();
        r=sc.nextDouble();
        t=sc.nextDouble();
        switch(ch)
            {
                case 1: 
            SI=(p*r*t)/100.0;
            A=SI+p;
            System.out.println("The SI is="+SI);
            System.out.println("The amount is="+A);
            break;
            case 2:
            CI=p*(Math.pow((1+r)/100.0,t)-1.0);
            A=CI+p;
            System.out.println("The CI is="+CI);
            System.out.println("The amount is="+A);
            break;
            /*default:
            System.out.println("Please enter the correct values next time if you try again!");
            break;*/
        }
    }
}


            
        