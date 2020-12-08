/*
Class: CSE 1321L
Section: W01
Term: Fall2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Lab#: 4Dm
*/
import java.util.Scanner;

public class Lab4D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gallons of water: ");
            int gals = sc.nextInt();

        if(gals <=1000) {
            double bill = gals * .15;
            System.out.print("Water bill is: $" + bill);
        }
        else if(gals > 1000 && gals < 2000) {
            double bill = ((gals - 1000) * .25)+(1000* .15);
            System.out.print("Water bill is: $" + bill);
        }
        else {
            double bill = (((gals-2000) * .35)+(1000 * .25)+(1000* .15));
            System.out.print("Water bill is: $" + bill);
        }
    }
}
