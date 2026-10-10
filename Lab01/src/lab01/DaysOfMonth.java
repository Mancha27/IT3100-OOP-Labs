package lab01;
import java.util.Scanner;
public class DaysOfMonth 
{
    public static int getMonth(String input) 
    {
        input = input.trim().toLowerCase();
        String[] fullNames = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        String[] abbreviations = {"jan.", "feb.", "mar.", "apr.","may", "june", "july", "aug.", "sept.", "oct.", "nov.", "dec."};
        String[] shortNames = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};
        for (int i = 0; i < 12; i++) 
        {
            if (input.equals(fullNames[i]) || input.equals(abbreviations[i]) || input.equals(shortNames[i]) || input.equals(String.valueOf(i + 1))) 
            {
                return i + 1;
            }
        }
        return -1;
    }

    public static boolean isLeapYear(int year) 
    {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static int getDays(int month, int year) 
    {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) 
        {
            return 29;
        }
        return days[month - 1];
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int month;
        int year;

        while (true) 
        {
            System.out.print("Enter month: ");
            String input = scanner.nextLine();
            month = getMonth(input);
            if (month != -1) 
            {
                break;
            }
            System.out.println("Invalid month. Try again!");
        }

        while (true) 
        {
            System.out.print("Enter year: ");
            String input = scanner.nextLine().trim();
            try 
            {
                if (!input.matches("[0-9]+")) 
                {
                    throw new NumberFormatException();
                }
                year = Integer.parseInt(input);
                break;

            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Invalid year. Try again!");
            }
        }
        int days = getDays(month, year);
        System.out.println("Number of days: " + days);
        scanner.close();
    }
}