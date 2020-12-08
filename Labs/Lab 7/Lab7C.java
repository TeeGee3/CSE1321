/*
Class: CSE 1321L
Section: W01
Term: Fall2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Lab#: 7C
*/

import java.util.*;
public class Lab7C {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the arrays: ");
        int amount = scan.nextInt();

        int[] array1 = new int[amount];
        int[] array2 = new int[amount];
        int i = 0;

        do {
            System.out.print("Enter array 1 slot " + i + ": ");
                array1[i] = scan.nextInt();

            System.out.print("Enter array 2 slot " + i + ": ");
                array2[i] = scan.nextInt();
                i++;
        } while(i < amount);




        if(Arrays.equals(array1, array2)){
            System.out.println("The arrays are identical");

        }
        else{
            System.out.println("The arrays are not identical");
        }
    }
}