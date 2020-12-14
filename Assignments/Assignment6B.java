/*
Class: CSE 1321L
Section: W01
Term: Fall 2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Assignment 6B

*/

import java.text.DecimalFormat;
import java.util.*;

public class Assignment6B {

    int num1, num2;
    public static void theSeason(int num1, int num2) {
        double num2frac = num2 * 0.01;
        double date = num1 + num2frac;


        if( date <= 3.18){
            System.out.print("It is Winter!");}

        else if( date >= 6.20 && date <= 9.21){
            System.out.print("It is Summer!"); }

        else if( date >= 3.19 && date <= 6.19){
            System.out.print("It is Spring!"); }

        else if( date >= 9.22 && date <= 12.20){
            System.out.print("It is Fall!"); }

        else if( date >= 12.21){
            System.out.print("It is Winter!"); }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a month: ");
        int num1 = sc.nextInt();


        System.out.print("Enter a day: ");
        int num2 = sc.nextInt();

        theSeason(num1, num2);

    }
}