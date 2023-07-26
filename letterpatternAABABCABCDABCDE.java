public class letterpatternAABABCABCDABCDE
{
    public static void main()
    {
        char i,j;
        for(i='A'; i<='E';i++)
        {
            for(j='A';j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        }
}