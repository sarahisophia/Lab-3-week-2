import java.util.Scanner;
public class FutureValue
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        double presentValue;
        double monthlyRate;
        int months;
        double futureVal;
        System.out.print("Enter the account's present value: ");
        presentValue=keyboard.nextDouble();


        System.out.print("Enter the monthly interest rate (decimal): ");
        monthlyRate=keyboard.nextDouble();


        System.out.print("Enter the number of months: ");
        months=keyboard.nextInt();
        futureVal=futureValue(presentValue, monthlyRate, months);
        
        System.out.printf("The future value of the account will be: $%,.2f\n", futureVal);
    }


    public static double futureValue(double p, double i, int t) 
    {
        return p * Math.pow(1 + i, t);
    }
}
