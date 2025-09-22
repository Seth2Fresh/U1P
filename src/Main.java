import java.util.Scanner;  // must import this class b/c it isn't "built in" like String and System


public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // create a Scanner "object"

        System.out.println("---------------------------------------------------------------");
        System.out.println("|Note! do not use any symbols when inputting data! (no $ or %)");
        System.out.println("---------------------------------------------------------------");

        System.out.println("Welcome!");
        System.out.print("Enter your Bill($): ");
        double billPT = scan.nextDouble();
        scan.nextLine();
        System.out.print("Tip Percent: ");
        double tipP = scan.nextDouble();
        scan.nextLine();
        System.out.print("Number of People: ");
        double numP = scan.nextDouble();
        scan.nextLine();
        double tipTotal100 = (Math.round(billPT*(tipP)));
        double tipTotal = tipTotal100/100;
        double billTotal = tipTotal+billPT;
        double tipPP100 = Math.round(tipTotal100/numP);
        double tipPP = tipPP100/100;
        double totalPP100 = Math.round(billTotal*100/numP);
        double totalPP = totalPP100/100;




        scan.close();
    }
}
