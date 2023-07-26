import java.util.Scanner;
public class kejane1
{
    public static void main()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = n; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= n - i; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}