/*
Class: CSE 1321L
Section: W01
Term: Fall 2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Assignment 6A

*/

import java.text.DecimalFormat;
import java.util.*;

public class Assignment6A {
    float num;


    public static Float colorCall(Float num){
        //DecimalFormat df = new DecimalFormat("#.######");
        //Float newNum = Float.valueOf(df.format(num/255));
        Float newNum = num/255;
        return newNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float input;

        System.out.print("Enter a red value (0-255): ");
        input = sc.nextFloat();
        Float red =  colorCall(input);

        System.out.print("Enter a green value (0-255): ");
        input = sc.nextFloat();
        Float green =  colorCall(input);
        System.out.print("Enter a blue value (0-255): ");
        input = sc.nextFloat();
        Float blue =  colorCall(input);


        System.out.print("New color is red="+red+", green="+green+", blue="+blue);

    }
}