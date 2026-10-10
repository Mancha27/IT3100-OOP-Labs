package lab01;
import javax.swing.JOptionPane;
public class Equations 
{
    public static void main(String[] args) 
    {
        while (true) 
        {
            String choice = JOptionPane.showInputDialog("Choose an equation type:\n1. First-degree equation\n2. System of linear equations\n3. Second-degree equation\n0. Exit");

            if (choice == null || choice.equals("0")) 
            {
                break;
            }

            switch (choice.trim()) 
            {
                case "1":
                    solveLinearEquation();
                    break;
                case "2":
                    solveLinearSystem();
                    break;
                case "3":
                    solveQuadraticEquation();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice!");
            }
        }
    }

    public static Double input(String message) 
    {
        while (true)   
        {
            String str = JOptionPane.showInputDialog(message);
            if (str == null) return null;
            try 
            {
                double value = Double.parseDouble(str.trim());
                if (Double.isFinite(value)) return value;
            } 
            catch (NumberFormatException e) {}
            JOptionPane.showMessageDialog(null, "Please enter a valid number!");
        }
    }

    public static void solveLinearEquation() 
    {
        Double a = input("Enter a:");
        if (a == null) return;
        Double b = input("Enter b:");
        if (b == null) return;
        String result;
        if (a == 0) 
        {
            if (b == 0) 
            {
                result = "Infinitely many solutions";
            } 
            else 
            {
                result = "No solution";
            }
        } 
        else 
        {
            result = "x = " + (-b / a);
        }
        JOptionPane.showMessageDialog(null, result);
    }

    public static void solveLinearSystem() 
    {
        Double a11 = input("Enter a11:");
        if (a11 == null) return;
        Double a12 = input("Enter a12:");
        if (a12 == null) return;
        Double b1 = input("Enter b1:");
        if (b1 == null) return;
        Double a21 = input("Enter a21:");
        if (a21 == null) return;
        Double a22 = input("Enter a22:");
        if (a22 == null) return;
        Double b2 = input("Enter b2:");
        if (b2 == null) return;

        double D = a11 * a22 - a12 * a21;
        double Dx = b1 * a22 - b2 * a12;
        double Dy = a11 * b2 - a21 * b1;

        String result;

        boolean inconsistent = (a11 == 0 && a12 == 0 && b1 != 0) || (a21 == 0 && a22 == 0 && b2 != 0);
        if (D != 0) 
        {
            double x = Dx / D;
            double y = Dy / D;
            result = "x = " + x + "\ny = " + y;
        } 
        else if (!inconsistent && Dx == 0 && Dy == 0) 
        {
            result = "Infinitely many solutions";
        } 
        else 
        {
            result = "No solution";
        }
        JOptionPane.showMessageDialog(null, result);
    }

    public static void solveQuadraticEquation() 
    {
        Double a = input("Enter a:");
        if (a == null) return;
        Double b = input("Enter b:");
        if (b == null) return;
        Double c = input("Enter c:");
        if (c == null) return;

        String result;

        if (a == 0) 
        {
            if (b == 0) 
            {
                if (c == 0) 
                {
                    result = "Infinitely many solutions";
                } 
                else 
                {
                    result = "No solution";
                }
            } 
            else 
            {
                result = "x = " + (-c / b);
            }
        } 
        else 
        {
            double delta = b * b - 4 * a * c;

            if (delta > 0) 
            {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                result = "x1 = " + x1 + "\nx2 = " + x2;
            } 
            else if (delta == 0) 
            {
                double x = -b / (2 * a);
                result = "Double root: x = " + x;
            } 
            else 
            {
                result = "No real roots";
            }
        }
        JOptionPane.showMessageDialog(null, result);
    }
}