/*
Class: CSE 1321L
Section: W01
Term: Fall2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Lab#: 6B
*/


import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Lab6B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int min = 1001, max = -1001, input = 1;
        while (input != 0) {
            System.out.print("Enter a number between -1000 and +1000: ");
            input = sc.nextInt();

            if (input != 0) {
                if (input > max) max = input;
                if (input < min) min = input;

            }

            System.out.println("Min is " + min);
            System.out.println("Max is " + max);


        }
    }
}
