package lab01;
import java.util.Arrays;
import java.util.Scanner;
public class Array 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        if (n <= 0) 
        {
            System.out.println("Invalid array size!");
            scanner.close();
            return;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));

        long sum = 0;
        for (int i = 0; i < n; i++) 
        {
            sum += arr[i];
        }

        double average = (double) sum / n;

        Arrays.sort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}