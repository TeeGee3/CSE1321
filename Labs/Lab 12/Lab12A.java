/*
Class: CSE 1321L
Section: W01
Term: Fall 2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Lab 12A

*/
public class Lab12A {
    public static void main(String args[]){

        Bulb a = new Bulb();
        Bulb b = new Bulb(1,100);
        System.out.println("Bulb 0 is "+a.status(0)+" and has used "+a.watts+" watt-hours.");
        System.out.println("Bulb 1 is "+b.status(0)+" and has used "+b.watts+" watt-hours.");
        System.out.println("Bulb 0 is "+a.status(0)+" and has used "+a.watts+" watt-hours.");
        System.out.println("Bulb 1 is "+b.status(1)+" and has used "+500+" watt-hours.");
    }
}

class Bulb {
    int ID;
    int watts;
    String status = "off";

    Bulb() {
        ID = 0;
        watts = 40;

    }

    Bulb(int i, int w) {
        ID = i;
        watts = w;

    }

    String status(int i) {
        if (i == 1) {
            status = "on";
            watts = watts * 5;
        }

        if (i == 0) {
            watts = 0;
        }
        return status;
    }



    int getWatts(int i, int w) {
        if (i == 0) {
            watts = 0;
        }
        if (i == 1) {
            watts = watts * 5;
        }
       return watts;
    }
}
