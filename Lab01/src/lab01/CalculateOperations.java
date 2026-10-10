// 2.2.5 Write a program to calculate sum, difference, product, and quotient of 2 double numbers which are entered by users.
package lab01;
import javax.swing.JOptionPane;
public class CalculateOperations
{
    public static void main(String[] args) 
    {
        String strNum1 = JOptionPane.showInputDialog("Enter the first number:");
        String strNum2 = JOptionPane.showInputDialog("Enter the second number:");
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        String result = "Sum: " + sum + "\nDifference: " + difference + "\nProduct: " + product;

        if (num2 != 0) 
        {
            double quotient = num1 / num2;
            result += "\nQuotient: " + quotient;
        } 
        else 
        {
            result += "\nQuotient: Undefined (division by zero)";
        }

        JOptionPane.showMessageDialog(null, result);
    }
}