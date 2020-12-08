/*
Class: CSE 1321L
Section: W01
Term: Fall2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Lab#: 4A
*/

import java.util.Scanner;

public class Lab4A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day: ");
        String day = sc.nextLine();

        switch (day) {
            case "Monday":
                System.out.print("Sounds like someone has a case of the Mondays!");
                break;
            case "Wednesday":
                System.out.print("It's hump day! El ombligo!");
                break;
            case "Friday":
                System.out.print("Finally. It's Friday!");
                break;
            default:
                System.out.print("It's another day of the week.");


        }
    }
}