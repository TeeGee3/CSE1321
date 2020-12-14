/*
Class: CSE 1321L
Section: W01
Term: Fall 2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Assignment 8A

*/

import java.util.*;

public class Assignment8A {



    public static int[][] sorting(int[][] sortingArray) {
// turn 2D array into 1D array then sort
        int[][] sortedArray;
        sortedArray = new int[3][3];
        sortedArray= sortingArray;

        int[] array1D;
        array1D = new int[9];

        int i = 0;


        //now to print both SORTED 2D array in one line separated by | and then compare
        for(int item[] : sortingArray){
            for(int number : item){

                do {

                    array1D[i] = number;
                    i++;
                    break;
                }while(i !=9);

            }
        }


//Sort the 1D array in ascending order using two for loops

        int[] list = array1D;


        for (int index = 1; index < list.length; index++) {
            int key = list[index];
            int position = index;
            //  Shift larger values to the right
            while (position > 0 && key < list[position - 1]) {
                list[position] = list[position - 1];
                position--;
            }
            list[position] = key;
        }


        //make 1D array 2D for sorting
        int count = 0; // Create counter variables
        int count2 = 0;


//        for( int z = 0; z < 9; z++) {
//            int number = array1D[z];
//            for (int row = 0; row < sortingArray.length; row++) {
//                for (int col = 0; col < sortingArray[0].length; col++) {
//                    sortedArray =





        return sortedArray;
    }



//        int temp = 0;
//        for (int i = 0; i < array1D.length; i++) {
//            for (int j = i + 1; j < array1D.length; j++) {
//                if (array1D[i] > array1D[j]) {      //swap elements if not in order
//                    temp = array1D[i];
//                    array1D[i] = array1D[j];
//                    array1D[j] = temp;
//                }
//            }
//        }










            public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//array 1
        int[][] array1 = new int[3][3];

        for(int row = 0; row < array1.length; row++){
            for(int col =0; col < array1.length; col++){
                System.out.print("Array 1 slot ("+row+","+col+"):");

                    array1[row][col] = sc.nextInt();
            }
        }
//prints the array in 3 by 3 display
        for(int item[] : array1){
            for(int number : item){
                 System.out.print(number + "\t");
            }
                System.out.println();
            }

//array 2
        int[][] array2 = new int[3][3];

        for(int row = 0; row < array2.length; row++){
            for(int col =0; col < array2[0].length; col++){
                System.out.print("Array 2 slot ("+row+","+col+"):");

                array2[row][col] = sc.nextInt();
            }
        }
//prints the array in 3 by 3 display
        for(int item[] : array2){
            for(int number : item){
                System.out.print(number + "\t");
            }
            System.out.println();
        }
//////////////////
                int[][] sortingArray;
                sortingArray = new int[3][3];
                sortingArray = array1;
                sorting(sortingArray);
                array1 = sortingArray;

                sortingArray = array2;
                sorting(sortingArray);
                array2 =sortingArray;





//now to print both SORTED 2D array in one line separated by | and then compare
        for(int item[] : array1){
            for(int number : item){
                System.out.print( "|"+number);


            }
        }
        System.out.print("|");
        System.out.println();
        for(int item[] : array2){
            for(int number : item){
                System.out.print( "|"+number);
            }
        }
        System.out.print("|");
        System.out.println();

        boolean results = Arrays.deepEquals(array1,array2);

        //System.out.print("the things are equal"+results);
        if(results){
        System.out.println("Arrays are equivalent.");
        }
        else{System.out.println("Arrays are not equivalent.");}













        }




    }


