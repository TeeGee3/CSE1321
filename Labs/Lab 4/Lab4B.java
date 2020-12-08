/*
Class: CSE 1321L
Section: W01
Term: Fall2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Lab#: 4B
*/
import java.util.Scanner;

public class Lab4B {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        System.out.print("Number of hours this week: ");
            int hours = sc.nextInt();

            if (hours <= 40) {
                int earnings = hours * 15;
                System.out.print("Earnings: $" + earnings);
            }
            else{
                    int overTime = (((hours-40)*25)+(40*15));
                    System.out.print("Earnings: $"+overTime);
                }





        }
    }
