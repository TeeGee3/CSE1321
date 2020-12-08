/*
Class: CSE 1321L
Section: W01
Term: Fall2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Lab#: 7A
*/

import java.util.*;

public class Lab7A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        int[] myArray = {0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169};
                // |0|1|4|9|16|25|36|49|64|81|100|121|144|169
        System.out.print("Enter the size of the array: ");
        int size = 0;
        size = sc.nextInt();

        for( int index = 0; index < size; index++) {

            System.out.print("|"+myArray[index]);
        }
        System.out.println();
    }
}

