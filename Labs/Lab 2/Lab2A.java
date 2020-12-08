//Class: CSE 1321L
//Section: W01
//Term: Fall2020
//Instructor: Keerthi Manchukonda
//Name: Taylor Goff
//Lab#: 2

import java.util.Scanner;

public class Lab2A
{
    public static void main (String[] args)
    {
        String name1;
        String name2;
        String verb;
        String adverb;

        Scanner input = new Scanner (System.in);
            System.out.print("Enter a name: ");
                name1 = input.nextLine();
            System.out.print("Enter another name: ");
                name2 = input.nextLine();
            System.out.print("Enter a verb: ");
                verb = input.nextLine();
            System.out.print("Enter an adverb: ");
                adverb = input.nextLine();

        System.out.print("Once upon a time, there was a person named "+name1+" who had a child named ");
        System.out.print(name2+". This child would "+verb+" "+adverb+" while singing to strangers.");
    }
}
