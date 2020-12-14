/*
Class: CSE 1321L
Section: W01
Term: Fall2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Assignment#: 3C
*/

import java.util.Scanner;

public class Assignment3C {
    public static void main(String[] args) {

        int people;
        double cost;
        int totBill;
        double withTip;
        String yesNo;
        double addTip = 0;

        double finBill = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("How many people in your party? ");
            people = sc.nextInt();
        System.out.print("What is the total cost of your bill? ");
            cost = sc.nextInt();


        if(people>=6) {
            cost =  ((cost*.18)+cost);
            System.out.println("Your bill is $" + cost);

            System.out.print("Would you like to include an additional tip (Y/N)? ");
                yesNo = sc.next();

            if (yesNo.contentEquals("Y")) {

                System.out.print("How much? ");
                addTip = sc.nextInt();
                withTip = addTip + cost;
                System.out.print("Total bill is: $" + withTip);
            } else {
                System.out.print("Total bill is: $"+cost);
            }
        }


        if(people< 6) {
            System.out.println("Your bill is $" + cost);
            System.out.print("How much for the tip? ");
                addTip = sc.nextInt();
                finBill = cost + addTip;
            System.out.print("Total bill is: $"+finBill);

        }

    }
}