/*
Class: CSE 1321L
Section: W01
Term: Fall 2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Lab: 10B

*/

import java.util.Scanner;
import java.lang.String;

public class Lab10B {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
            String input;
        System.out.print("Enter a string:");
            input = sc.nextLine();
        badWord(input);
    }

    public static void badWord(String word)
    {
        char[] arr= word.toCharArray();
        for (int i=0; i< arr.length; i++){
            if( arr[i]=='d' &&  arr[i+1]=='a' &&  arr[i+2]=='n' && arr[i+3]=='g')
            {
                System.out.println("Found bad word at:"+i);
            }


        }
        String res = word.replace("dang", "&^#@");
        System.out.println (res);
    }
}
