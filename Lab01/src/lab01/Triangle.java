package lab01;
import java.util.Scanner;
public class Triangle 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        long n = scanner.nextInt();
        scanner.close();
        for (long i = 1; i <= n; i++)
        {
            for (long j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            for (long j = 1; j <= (i - 1)*2 + 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
