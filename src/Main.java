import java.text.DecimalFormat;
import java.util.Scanner;  // must import this class b/c it isn't "built in" like String and System


public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // create a Scanner "object"
        DecimalFormat df =new DecimalFormat("0.00"); // creates a decimal format
        System.out.println("---------------------------------------------------------------");
        System.out.println("|Note! do not use any symbols when inputting data! (no $ or %)");
        System.out.println("---------------------------------------------------------------");

        System.out.print("Enter your Bill($): ");
        double billPT = scan.nextDouble();
        scan.nextLine();
        // user inputted bill
        System.out.print("Tip Percent: ");
        double tipP = scan.nextDouble();
        scan.nextLine();
        // user inputted tip %
        System.out.print("Number of People: ");
        double numP = scan.nextDouble();
        scan.nextLine();
        // user inputted number of people
        double tipTotal = billPT*(tipP)/100;
        //multiples the inputted bill and the tip percent divided by 100 and rounds to get the tip as a double with 2 decimal places
        double billTotal = tipTotal+billPT;
        // adds the tip and the inputted bill amount
        double tipPP = tipTotal/numP;
        // takes the tip, divides by the number of people to get a tip per person rounded to the nearest hundredth
        double totalPP = billTotal/numP;
        // takes the total bill, divides by the number of people to get a total per person rounded to the nearest hundredth
        System.out.println("-----------------------------");
        System.out.println("|Total Tip Amount: $" +df.format(tipTotal));
        System.out.println("-----------------------------");
        System.out.println("|Total Bill Cost: $" +df.format(billTotal));
        System.out.println("-----------------------------");
        System.out.println("|Tip Per Person: $"+ df.format(tipPP));
        System.out.println("-----------------------------");
        System.out.println("|Total Bill Per Person: $" + df.format(totalPP));
        System.out.println("-----------------------------");
// prints everything out
        scan.close();
    }
}
