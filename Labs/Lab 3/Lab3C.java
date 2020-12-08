/*
Class: CSE 1321L
Section: W01
Term: Fall2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Lab#: 3C
*/

import java.util.Scanner;

// This will calculate the total amount of dollars and change based on the quantity amount of each coin entered.

class Lab3C {

    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

            System.out.print("Enter the number of quarters: ");
                int quarters = sc.nextInt();
            System.out.print("Enter the number of dimes: ");
                int dimes = sc.nextInt();
            System.out.print("Enter the number of nickels: ");
                int nickels = sc.nextInt();
            System.out.print("Enter the number of pennies: ");
                int pennies = sc.nextInt();
            System.out.println(" ");

        System.out.println("You entered "+quarters+" quarters.");
        System.out.println("You entered "+dimes+" dimes.");
        System.out.println("You entered "+nickels+" nickels.");
        System.out.println("You entered "+pennies+" pennies.");
        System.out.println(" ");

        int totalAmnt = (int) ((quarters*25)+(dimes*10)+(nickels*5)+(pennies*1));

            int totDollar = (int) totalAmnt/100;
            int totCents = (int) totalAmnt % 100;

        System.out.println("Your total is " + totDollar + " dollars and " + totCents + " cents.");

}
}
