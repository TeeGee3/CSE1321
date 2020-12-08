/*
Class: CSE 1321L
Section: W01
Term: Fall 2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Assignment 14C

*/
import java.util.Scanner;

public class Lab14C {

    public static int[][] addArrays(int[][] a, int[][] b) {
        int[][] ab = new int[3][3];

//adding the two arrays
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[0].length; col++) {
                ab[row][col] = a[row][col] + b[row][col];
            }
        }

////Displays input in matrix format A + B
//        System.out.println("Matrix A + B: ");
//        for (int[] item : ab) {
//            for (int number : item) {
//                System.out.print(number + "\t");
//            }
//            System.out.println();
//        }

        return ab;
    }




    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

int[][] a = new int[3][3];

// user inputs the numbers for the array a
        for(int row = 0; row < a.length; row++){
            for(int col =0; col < a[0].length; col++){
                System.out.print("Enter a value:");
                a[row][col] = sc.nextInt();
            }
        }

// user inputs the numbers for the array b
int[][] b = new int[3][3];

        for(int row = 0; row < b.length; row++){
            for(int col =0; col < b[0].length; col++){
                System.out.print("Enter a value:");
                b[row][col] = sc.nextInt();
            }
        }
//Displays input in matrix format A
        System.out.println("Matrix A: ");
        for(int[] item : a){
            for(int number : item){
                System.out.print(number + "\t");
            }
            System.out.println();
        }


//Displays input in matrix format B
        System.out.println("Matrix B: ");
        for(int[] item : b){
            for(int number : item){
                System.out.print(number + "\t");
            }
            System.out.println();
        }
//call the method

        int[][] c = addArrays(a, b);
// display the returned ab array as C
        System.out.println("Matrix A + B: ");
        for(int[] item : c) {
            for (int number : item) {
                System.out.print(number + "\t");
            }
            System.out.println();

        }


    }
}
