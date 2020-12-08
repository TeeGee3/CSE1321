/*
Class: CSE 1321L
Section: W01
Term: Fall2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Lab#: 6A
*/

import java.util.Scanner;

public class Lab6A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userInput;
        String answer = "cookie";

        do {

            System.out.print("gimme a cookie: ");
                userInput = sc.nextLine();


        } while(!userInput.equals(answer));
    }
}