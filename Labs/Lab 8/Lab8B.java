/*
Class: CSE 1321L
Section: W01
Term: Fall 2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Lab#: 8B

*/

import java.util.*;

public class Lab8B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 15;
        int[] myArray = new int[size];
        int i = 0;

        while (i < myArray.length) {

            System.out.print("Enter slot " + i + ": ");
            myArray[i] = sc.nextInt();
            i++;
        }

        System.out.print("Enter Target: ");
        int target = sc.nextInt();
        i = 0;

        //System.out.println();

        //print array with pipes |
        do {
            System.out.print(myArray[i] + "|");
            i++;
        } while (i < myArray.length);

        System.out.println(" ");

        //System.out.println(" now time to search");

        //linear search
        boolean isFound = false;
        for (int ii = 0; ii < myArray.length; ii++) {
            System.out.print(ii+" ");

            // If we find a match, return true
            if (myArray[ii] == target)
                isFound = true; continue;
        }
        System.out.println(" ");

        //System.out.println("Now time for Binary search");

        //sort list to use binary search
        for (int ii = 0; ii < size - 1; ii++) {
            for (int j = 0; j < size - ii - 1; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }

        // Binary search
        int low = 0, mid = 0;
        int high = myArray.length - 1;
        boolean found = false;

        while (high >= low) {
            mid = (low + high) / 2;
            System.out.print(mid + " ");
            if (target < myArray[mid]) {
                high = mid - 1;
            } else if (target == myArray[mid]) {
                found = true;
                break;
            } else {
                low = mid + 1;
                    }
                }


            }
        }
