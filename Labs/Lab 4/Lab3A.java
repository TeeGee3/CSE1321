import java.text.DecimalFormat;
import java.util.Scanner;

class Lab3A {
    public static void main(String[] args) {

        int owed;
        float apr;

        Scanner sc = new Scanner (System.in);

        System.out.print("Amount owed: $");
        owed = sc.nextInt();
        System.out.print("APR: ");
        apr = sc.nextFloat();


        float monthlyRate = apr/12;
        //float PERCENT = .001;
        double percentRate = (monthlyRate * .01);
        double min = (percentRate * owed);
        DecimalFormat df = new DecimalFormat("#.#####");

        System.out.println("Monthly percentage rate: "+df.format(monthlyRate));
        DecimalFormat df1 = new DecimalFormat("##.####");
        System.out.println("Minimum payment: $"+df1.format(min));
    }
}