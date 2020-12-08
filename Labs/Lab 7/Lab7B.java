/*
Class: CSE 1321L
Section: W01
Term: Fall2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Lab#: 7B
*/

import java.util.*;
public class Lab7B {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.print("Enter the number of GPAs: ");
        float amtGPA = scan.nextFloat();

        float[] gpaArray = new float[(int) amtGPA];

        for (int i = 0; i <= amtGPA; i++) {
            System.out.print("GPA #" + i + ": ");
            gpaArray[i] = scan.nextFloat();


            if (gpaArray[i] < 2) {
                System.out.println("Student #" + i + ": Not graduating");
            }

            if (gpaArray[i] < 3.50) {
                System.out.println("Student #" + i + ": Graduating");
            }

            if (gpaArray[i] >= 3.50) {
                System.out.println("Student #" + i + ": Cum Laude");
            }

            if (gpaArray[i] <= 3.70) {
                System.out.println("Student #" + i + ": Magna Cum Laude");
            }

            if (gpaArray[i] >= 3.90) {
                System.out.println("Student #" + i + ": Magna Cum Laude");
            }

        }
    }
}

//        Summa Cum Laude (3.90 - 4.00)
//        Magna Cum Laude (3.70 - 3.89)
//        Cum Laude (3.50 - 3.69)