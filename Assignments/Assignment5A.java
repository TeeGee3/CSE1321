/*
Class: CSE 1321L
Section: W01
Term: Fall 2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Assignment 5A

*/

import java.util.*;

public class Assignment5A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numYears ; //size of array


        int startYear = 0; // beggining year - which equals arrY[0]
        int statYi = 0;
        int bestStat = 0;
        int worstStat = 0;

//        System.out.print();


            System.out.print("Enter the number of years: ");
                numYears = sc.nextInt();
            System.out.print("Enter the starting year: ");
                startYear = sc.nextInt();
                int[] arrY = new int[numYears]; //array for the years

                arrY[0] = startYear;

//create an array of the years that will be asked about in the next loop
        for(int k = 1; k < numYears; k++) {
            arrY[k] = startYear + 1;
            startYear = startYear + 1;
        }

        int[] arrS = new int[numYears]; //array for the stats of the year
        int[] sortStat = new int[numYears]; // same as arrS but will sort it, then use the index 0 as worst, and index 5 as best, then search those elements in arrS

//obtaining the stats for the years and putting into second array
        for ( int i = 0; i < numYears; i++) {
            System.out.print("Enter stat for year "+arrY[i]+": ");
                arrS[i] = sc.nextInt();

            sortStat[i] = arrS[i];
        }

// now to sort the second version of the stat array, then we will search for the element that is at 0 and 5 in arrS
// once we find the elements in arrS, we will use those index numbers to print to appropriate year
        for (int ii = 0; ii < numYears - 1; ii++) { //this for loop is sorting
            for (int j = 0; j < numYears - ii - 1; j++) {
                if (sortStat[j] > sortStat[j + 1]) {
                    int temp = sortStat[j];
                    sortStat[j] = sortStat[j + 1];
                    sortStat[j + 1] = temp;
                }
            }
        }

        bestStat = sortStat[4];
        worstStat = sortStat[0];
        int worstStatYear =0;
        int bestStatYear = 0;



//now to search for the element under bestStat and worstStat un the unsorted arrS
//the index of the element in the unsorted arrS will give us the correct index for the year
        //linear search for BEST stat

        for (int ii = 0; ii < arrS.length; ii++) {

            // If we find a match, return true
            if (arrS[ii] == bestStat){
                bestStatYear = ii;
                break;
            }
        }
        System.out.println("Best stat was "+bestStat+" in year "+arrY[bestStatYear]);

    //linear search for worst stat

        for (int ii = 0; ii < arrS.length; ii++) {

            // If we find a match, return true
            if (arrS[ii] == worstStat){
                worstStatYear = ii;
                break;

        }
        }
        System.out.println("Worst stat was "+worstStat+" in year "+arrY[worstStatYear]);


    }
}
