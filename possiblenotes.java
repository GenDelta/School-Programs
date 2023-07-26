import java.util.*;
class possiblenotes
{
    void main()
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the maturity value:");
        int mv=sc.nextInt();
        int notes[]={2000,500,200,100,50,20,10,5,2,1};
        int counter[]=new int[10];
        for(i=0;i<10;i++)
        {
            if(mv>=notes[i])
            {
                counter[i]=mv/notes[i];
                mv=mv-counter[i]*notes[i];
            }
        }
        System.out.println("Notes given by the bank to the customer:");
        for(i=0;i<10;i++)
        {
            if(counter[i]!=0)
            {
                System.out.println(notes[i]+":"+counter[i]);
            }
        }
    }
}