/*
Class: CSE 1321L
Section: W01
Term: Fall2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Lab#: 5B
*/

import java.util.Scanner;

public class Lab5B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int today;
        int daysUntil;
        int meetingDay;

        System.out.print("Enter a number that represents today (Sunday==0, Monday==1,...) ");
            today = sc.nextInt();
        System.out.print("Enter the number of days until the meeting: ");
            daysUntil = sc.nextInt();

        meetingDay = ((today + daysUntil)%7);

        switch(meetingDay){
            case 0:
                System.out.println("Meeting day is Sunday");
                break;

            case 1:
                System.out.println("Meeting day is Monday");
                break;

            case 2:
                System.out.println("Meeting day is Tuesday");
                break;

            case 3:
                System.out.println("Meeting day is Wednesday");
                break;

            case 4:
                System.out.println("Meeting day is Thursday");
                break;
            case 5:
                System.out.println("Meeting day is Friday");
                break;
            case 6:
                System.out.println("Meeting day is Saturday");
                break;


        }

    }
}
