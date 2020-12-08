/*
Class: CSE 1321L
Section: W01
Term: Fall2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Lab#: 5A
*/

import java.util.Scanner;

public class Lab5A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char answer1;
        char answer2;


        System.out.print("Experiencing severe symptoms (Y/N)? ");
        answer1 = sc.next().charAt(0);

        switch (answer1) {
            case 'Y':
                System.out.print("Seek emergency care.");
                break;

            case 'N':
                System.out.print("Close contact with someone who has COVID (Y/N)? ");
                answer2 = sc.next().charAt(0);

                switch (answer2) {
                    case 'Y':
                        System.out.print("Quarantine and get tested if you feel sick.");
                        break;

                    case 'N':
                        System.out.print("If you experience other symptoms, isolate and get tested.");
                        break;


                }
        }
    }
}