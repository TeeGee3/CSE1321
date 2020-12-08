/*
Class: CSE 1321L
Section: W01
Term: Fall2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Lab#: 5C
*/

import java.util.Scanner;

public class Lab5C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        System.out.print("Enter x: ");
            x = sc.nextInt();
        System.out.print("Enter y: ");
            y = sc.nextInt();

        if(x==0 && y==0) {
            System.out.println("This point is the origin.");
        }
        if(x ==0 && y!=0) {
            System.out.println("This point is on the y axis.");
        }
        if(x !=0 && y==0) {
            System.out.println("This point is on the x axis.");
        }
        if(x >0 && y>0) {
            System.out.println("This point is in the first quadrant.");
        }
        if(x <0 && y<0) {
            System.out.println("This point is in the third quadrant.");
        }
        if(x <0 && y>0) {
            System.out.println("This point is in the second quadrant.");
        }
        if(x >0 && y<0) {
            System.out.println("This point is in the fourth quadrant.");
        }


    }
}
