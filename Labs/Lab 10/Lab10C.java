/*
Class: CSE 1321L
Section: W01
Term: Fall 2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Lab: 10C

*/

import java.util.Scanner;
import java.lang.String;

public class Lab10C {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String new_text = "";


        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++) {
             if ((int) text.charAt(i) >= 97 && (int) text.charAt(i) <= 122) {
                int ascii = (int) text.charAt(i) - 97;

                ascii = (ascii + 13) % 26;


                new_text = new_text + (char) (ascii + 97);
            }
             else {
                 new_text = new_text + text.charAt(i);
             }

        }
        System.out.println(new_text);
    }
    }
