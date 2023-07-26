import java.util.*;  //apologies for the late submission
class dokanekoshto 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        int code[]=new int[5];
        double price[]=new double[5];
        int qty[]=new int[5];
        double gross=0.0, net=0.0;
        int temp=0,index=-1;
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter code of product " + (i + 1) + ": ");
            code[i] = sc.nextInt();
            System.out.print("Enter unit price of product " + (i + 1) + ": ");
            price[i] = sc.nextDouble();
            System.out.print("Enter quantity of product " + (i + 1) + ": ");
            qty[i] = sc.nextInt();
            if(code[i]==0)
            {
                System.out.println("Invalid Input");
                System.exit(0);
            }
            if(price[i]<=0)
            {
                System.out.println("Invalid Input");
                System.exit(0);
            }
            if(qty[i]<0)
            {
                System.out.println("Invalid Input");
                System.exit(0);
            }
        }
        System.out.println("Code\t"+"Price\t"+"Quantity\t");
        for(int i=0;i<5;i++)
        {
            System.out.println(code[i]+"\t"+price[i]+"\t"+qty[i]);
        }
        System.out.println("Enter product code of your choice");
        int choice=sc.nextInt();
        System.out.println("Enter quantity of the product required");
        int quantity=sc.nextInt();
        if(quantity<0)
        {
          System.exit(0);
        }    
        for(int i=0;i<5;i++)
        {
            if(choice==code[i])
            {
                index=i;
            }
        }
        if(index==-1)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        else
        {
            gross=price[index]*quantity;
            net=gross*(1.0-(10.0/100.0))*(1.0+(5.0/100.0));
            System.out.println("Bill:");
            System.out.println("Product code:\t"+choice);
            System.out.println("Quantity bought:\t"+quantity);
            System.out.println("Gross price:\t"+gross);
            System.out.println("Net price:\t"+net);
            qty[index]=qty[index]-quantity;
            System.out.println("Updated inventory information:");
            System.out.println("Code\t"+"Price\t"+"Quantity\t");
            for(int i=0;i<5;i++)
            {
                System.out.println(code[i]+"\t"+price[i]+"\t"+qty[i]);
            }
        }
    }
}
