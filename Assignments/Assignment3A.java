/*
Class: CSE 1321L
Section: W01
Term: Fall2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Assignment#: 3A
*/

import java.util.Scanner;

public class Assignment3A {
    public static void main(String[] args){

        String guest1;
        String guest2;
        String T = "Taylor";
        String F = "Fernando";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter guest 1: ");
            guest1 = sc.nextLine();
        System.out.print("Enter guest 2: ");
            guest2 = sc.nextLine();

        if(guest1.contains(T) & guest2.contains(F)) {
            System.out.print("Your party is ruined and another bad pop song will be written.");
        }
        else if(guest1.contains(F) & guest2.contains(T)) {
            System.out.print("Your party is ruined and another bad pop song will be written.");
        }
        else{
            System.out.println("Your party was a hit!");
       }

    }
}
