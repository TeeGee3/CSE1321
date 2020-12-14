import java.util.Scanner;

public class Assignment2B {
    public static void main(String[] args) {
        int width;
        int length;
        float sqftpdot;

        Scanner input = new Scanner(System.in);

        System.out.print("Width: ");
            width = input.nextInt();
        System.out.print("Length: ");
            length = input.nextInt();
        System.out.print("Square feet per dot: ");
            sqftpdot = input.nextInt();

        int area = width * length;
        float dots = area / sqftpdot;

        System.out.print("A yard of " + area + " square feet will take " + dots + " dots to cut.");
    }
}

