/*
Class: CSE 1321L
Section: W01
Term: Fall 2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Assignment 14A

*/

import java.util.*;

public class Lab14A {

    public static int rowTotal(int[][] array1) {
        int rowTotal = 0;
        for (int row = 0; row < array1.length; row++) {
            rowTotal = 0;
            for (int column = 0; column < array1[row].length; column++) {
                    rowTotal += array1[row][column]; }
            System.out.println("Sum for row " + row + " is " + rowTotal);

            }
        return rowTotal;
    }


    public static int columnTotal(int[][] array1){
        int total = 0;

        for (int column = 0; column < array1[0].length; column++) {
            total = 0;
            for (int row = 0; row < array1.length; row++){
                total += array1[row][column];}
            System.out.println("Sum for column " + column + " is " + total);
        }
        return total;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int[][] array1 = new int[3][4];


// user inputs the numbers for the array
        for(int row = 0; row < array1.length; row++){
            for(int col =0; col < array1[0].length; col++){
                System.out.print("Enter a value:");
                    array1[row][col] = sc.nextInt();
            }
        }
//Displays input in matrix format
        System.out.println("The entered matrix: ");
        for(int item[] : array1){
            for(int number : item){
                System.out.print(number + "\t");
            }
            System.out.println();
        }

        int col = columnTotal(array1);
        int row = rowTotal(array1);



    }
}
