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
        double tipTotal100 = (Math.round(billPT*(tipP)));
        //multiples the inputted bill and the tip percent and rounds to get 100x the tip as an int
        double tipTotal = tipTotal100/100;
        //divides by 100 to get a double with 2 decimal places
        double billTotal = tipTotal+billPT;
        // adds the tip and the inputted bill amount
        double tipPP100 = Math.round(tipTotal100/numP);
        double tipPP = tipPP100/100;
        // takes the 100x tip, divides by the number of people, then divides by 100 to get a tip per person rounded to the nearest hundredth
        double totalPP100 = Math.round(billTotal*100/numP);
        double totalPP = totalPP100/100;
        // takes the 100x total bill, divides by the number of people, then divides by 100 to get a total per person rounded to the nearest hundredth
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
