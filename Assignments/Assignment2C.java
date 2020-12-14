// https://ccse.kennesaw.edu/fye/docs/1321/labs/m2/fa20/M2%20-%20A2%20-%20FA20.pdf

import java.util.Scanner;

public class Assignment2C {
    public static void main(String[] args) {
        int vPixel;
        int hPixel;
        float diagLenIn;

        Scanner input = new Scanner(System.in);

        System.out.print("Horizontal pixels: ");
            hPixel = input.nextInt();
        System.out.print("Vertical pixels: ");
            vPixel = input.nextInt();
        System.out.print("Diagonal length in inches: ");
            diagLenIn = input.nextFloat();

            double diagPixel = ((vPixel * vPixel) + (hPixel * hPixel));  //Diagonal Pixels = Square root of (Vertical Pixels² + Horizontal Pixels²)
            double diagPixel1 = Math.sqrt(diagPixel);
            int ppi = (int) Math.floor(diagPixel1 / diagLenIn); //PPI = Diagonal Pixels / inches

        System.out.println("Pixels Per inch: "+ppi);


    }
}
