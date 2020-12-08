/*
Class: CSE 1321L
Section: W01
Term: Fall2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Lab#: 3A
*/
// takes how much you own and APR rate determines your monthly rate and minimum payment.

import java.util.Scanner;

class Lab3A {
    public static void main(String[] args) {

        int owed;
        float apr;

        Scanner sc = new Scanner (System.in);

            System.out.print("Amount owed: $");
            owed = sc.nextInt();
            System.out.print("APR: ");
            apr = sc.nextFloat();


        float monthlyRate = apr/12;
        //float PERCENT = .001;
        float percentRate = (float) (monthlyRate * .01);
        float min = (percentRate * owed);

        System.out.println("Monthly percentage rate: "+monthlyRate);
        System.out.println("Minimum Payment: $"+min);

    }
}