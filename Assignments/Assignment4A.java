/*
Class: CSE 1321L
Section: W01
Term: Fall2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Lab#: 4A
*/

import java.util.*;

    public class Assignment4A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seed1, seed2, sum, iterations;


        System.out.print("Enter seed 1: ");;
            seed1 = sc.nextInt();
        System.out.println();
        System.out.print("Enter seed 2: ");
           seed2 = sc.nextInt();
        System.out.println();
        System.out.print("Number of iterations: ");
            iterations = sc.nextInt();

            System.out.println();



            System.out.print(seed1);
            System.out.print(","+seed2);

            //sum = seed1 + seed2;

        for(int i =0; i < iterations; i++){

            sum = seed1 + seed2;
            seed1 = seed2;
            seed2 = sum;

            System.out.print(","+sum);
        }


    }
}