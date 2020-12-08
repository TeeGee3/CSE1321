/*
Class: CSE 1321L
Section: W01
Term: Fall 2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Lab: 10A

*/

import java.util.Scanner;
import java.lang.String;

public class Lab10A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.print("Enter a string: ");
            input = sc.nextLine();
           vowelString(input);

    }
    public static String vowelString(String line) {
        int count = 0;
        char[] chars = line.toCharArray();

        for (int i = 0; i < chars.length; i++) // this loop searches for vowel
        {

            if (chars[i] == 'a') {
                chars[i] = '*';
                count++;
            }
            if (chars[i] == 'e') {
                chars[i] = '*';
                count++;
            }
            if (chars[i] == 'i') {
                chars[i] = '*';
                count++;
            }
            if (chars[i] == 'o') {
                chars[i] = '*';
                count++;
            }
            if (chars[i] == 'u') {
                chars[i] = '*';
                count++;
            }
            System.out.print(chars[i]);

        }


        System.out.println("");
        System.out.print("That string has "+count+" vowels.");
        return line;

    }

}

