//Class: CSE 1321L
//Section: W01
//Term: Fall2020
//Instructor: Keerthi Manchukonda
//Name: Taylor Goff
//Lab#: 2

import java.util.Scanner;

public class Lab2C
{
    public static void main(String[] args) {

        int width;
        int height;
        int area;
        int perimeter;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a width: ");
        width = input.nextInt();
        System.out.print("Enter a height: ");
        height = input.nextInt();
        area = width * height;
        perimeter = ((width * 2) + (height * 2));
        System.out.println("The area is " + area );
        System.out.println("The perimeter is " + perimeter );
    }
}
