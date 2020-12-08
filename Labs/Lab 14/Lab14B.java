/*
Class: CSE 1321L
Section: W01
Term: Fall 2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Assignment 14B

*/
import java.util.Scanner;

public class Lab14B {
    public static int[] findMax(int[][] array1) {
        int max = 0;
        int maxX =0;
        int maxY = 0;
        int[] xandY = new int[2];


        int maxNum = array1[0][0];
        for (int x = 0; x < array1.length; x++) {
            for (int y = 0; y < array1[x].length; y++) {
                if (maxNum < array1[x][y]) {
                    maxNum = array1[x][y];
                    maxX =x;
                    maxY = y;}

                xandY[0] = maxX;
                xandY[1] = maxY;

            }

        }
        System.out.println();

        //System.out.println("First largest value is located at row "+maxX+" and column "+maxY);


        return xandY;
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
//call the method findMax()



        int[] maxIndex = findMax(array1);
        System.out.println("First largest value is located at row "+maxIndex[0]+" and column "+maxIndex[1]);



    }
}


