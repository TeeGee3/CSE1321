/*
Class: CSE 1321L
Section: W01
Term: Fall 2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Assignment 7A

*/
import java.util.Scanner;

public class Assignment7A {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int x, y, xV , yV, tm;

        System.out.print("x: ");
        x = sc.nextInt();

        System.out.print("y: ");
        y = sc.nextInt();

        System.out.print("x velocity: ");
        xV = sc.nextInt();

        System.out.print("y velocity: ");
        yV = sc.nextInt();

        System.out.print("Number of moves: ");
        tm = sc.nextInt();

        System.out.println("x:"+x+" y:"+y);

        Ball b1 = new Ball(x,y, xV, yV, tm);
        b1.move();


    }
}
