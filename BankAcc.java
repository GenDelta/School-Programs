import java.util.*;
public class BankAcc
{
    int acc,amt,dep;
    BankAcc()
    {
        acc=0;
        amt=0;
        dep=0;
    }
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        BankAcc ob=new BankAcc();
        System.out.println("Enter name of depositor");
        String name=sc.nextLine();
        System.out.println("Enter type of account");
        String type=sc.nextLine();
        System.out.println("Enter account number");
        acc=sc.nextInt();
        System.out.println("Enter total balance in the account");
        amt=sc.nextInt();
        System.out.println("Enter 1 to deposit an amount and 2 to withdraw an amount");
        int c=sc.nextInt();
        int b=0;
        if(c==1)
        {
            b=deposit();
        }
        if(c==2)
        {
            b=withdraw();
        }
        ob.display(b,name);
    }
    public int deposit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount to be deposited:");
        dep=sc.nextInt();
        amt=amt+dep;
        return amt;
    }
    public int withdraw()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount to be withdrawn:");
        int w=sc.nextInt();
        amt=amt-w;
        return amt;
    }
    public void display(int amt,String name)
    {
        System.out.println("Name : "+name);
        System.out.println("Updated Balance : "+amt);
    }
}