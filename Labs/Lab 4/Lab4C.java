/*
Class: CSE 1321L
Section: W01
Term: Fall2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Lab#: 4C
*/

import java.util.Scanner;

public class Lab4C {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select from the following:");
        System.out.println("To see a list of movies, press 1.");
        System.out.println("To see show times, press 2.");
        System.out.println("To pay your bill, press 3.");
        System.out.print("Choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:

                System.out.println("The Neverending Story 6");
                System.out.println("Princess Diaries: the untold story");
                System.out.println("Monty Python and the Programmer");
                break;

            case 2:

                System.out.println("All movies play at 3PM.");
                break;

            case 3:

                System.out.println("Corporate accounts payable, Nina speaking. Just a moment!");
                break;

            default:
                System.out.println("I'm sorry, Dave. I can't do that.");
        }
    }
}

