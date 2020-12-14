/*
Class: CSE 1321L
Section: W01
Term: Fall2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Lab#: 4B
*/

import java.util.*;

public class Assignment4B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size: ");
        int size = sc.nextInt();

        int i, j;
        for(i=0; i<size; i++)
        {


            for(j=2*(size-i); j>=0; j--)
            {
                // printing spaces
                System.out.print(" ");
            }


            for(j=0; j<=i; j++)
            {
                // printing stars
                System.out.print("* ");
            }


            System.out.println();


//        for (int a = 0; a <= size; a++) {
//            System.out.print("* ");
//            for (int b = 0; b <= (size - 1); b++) {
//                System.out.print("* ");
//                for (int c = 0; c <= (size - 2); c++) {
//                    System.out.print("* ");

                }
            }


        }
