/*
Class: CSE 1321L
Section: W01
Term: Fall2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Lab#: 3B
*/

// Calculates GPA by multiplying course * grades, then adding them all together.Then divide the qualityPoints by totalHr

import java.util.Scanner;

class Lab3B {
    public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);

        System.out.print("Course 1 hours: ");
            float course1 = sc.nextFloat();
                System.out.print("Grade for course 1: ");
                    float grade1 = sc.nextFloat();

        System.out.print("Course 2 hours: ");
            float course2 = sc.nextFloat();
                System.out.print("Grade for course 2: ");
                    float grade2 = sc.nextFloat();

        System.out.print("Course 3 hours: ");
            float course3 = sc.nextFloat();
                System.out.print("Grade for course 3: ");
                    float grade3 = sc.nextFloat();

        System.out.print("Course 4 hours: ");
            float course4 = sc.nextFloat();
                System.out.print("Grade for course 4: ");
                    float grade4 = sc.nextFloat();



        float totalHr = course1 + course2 + course3 + course4;
            System.out.println("Total hours is: "+totalHr);
        float qualityPoints = (grade1*course1) + (grade2*course2) + (grade3*course3) + (grade4*course4);
            System.out.println("Total quality points is: " + qualityPoints);
        float gpa = qualityPoints/totalHr;
            System.out.println("Your GPA for this semester is "+gpa);



    }
}
