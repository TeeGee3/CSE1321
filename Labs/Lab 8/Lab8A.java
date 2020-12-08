/*
Class: CSE 1321L
Section: W01
Term: Fall2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Lab#: 8A
*/

import java.util.*;

public class Lab8A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 10;
        int[] myArray = new int[size];
        int i = 0;

        while(i < myArray.length) {

            System.out.print("Enter slot " + i + ": ");
            myArray[i] = sc.nextInt();
            i++;
        }

        //System.out.println("This is the array"+Arrays.toString(myArray));

        int numSwap = 0;
        int swapCount = 0;




        for (int ii = 0; ii < size -1; ii++){
            for (int j = 0; j < size-ii-1; j++){
                if (myArray[j] > myArray[j+1]){
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                    swapCount++;
                }
            }
            numSwap = swapCount;

        }
        System.out.print(myArray);
        System.out.print(" Num swaps: "+numSwap);
        System.out.println();

    }
}