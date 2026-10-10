package lab01;
import java.util.Scanner;
public class MatrixAddition 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        if (rows <= 0 || cols <= 0) 
        {
            System.out.println("Invalid matrix dimensions!");
            scanner.close();
            return;
        }

        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];
        int[][] C = new int[rows][cols];

        System.out.println("Enter matrix A:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter matrix B:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                B[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Result matrix:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}