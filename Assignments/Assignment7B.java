/*
Class: CSE 1321L
Section: W01
Term: Fall 2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Assignment 7B

*/

import java.util.Scanner;
public class Assignment7B {
    public static class Main {
        static int getUserChoice(Scanner keyboard) {
            System.out.println("Would you like to: ");
            System.out.println("1) Charge");
            System.out.println("2) Make a payment");
            System.out.println("3) See current balance");
            System.out.print("4) Quit");
            int choice = keyboard.nextInt();
            return choice;
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            float amount = 0.0f;
            CreditCard myCard = new CreditCard(0.00f);
            int userChoice = 0;
            do {
                userChoice = getUserChoice(scan);
                switch (userChoice) {
                    case 1:
                        System.out.print("Amount to charge: ");
                        amount = scan.nextFloat();
                        myCard.charge(amount);
                        break;
                    case 2:
                        System.out.print("Amount to pay: ");
                        amount = scan.nextFloat();
                        myCard.makePayment(amount);
                        break;
                    case 3:
                        myCard.print();
                        break;
                }
            } while (userChoice != 4);
        }


        public static class CreditCard {

            float amount, balance, points;

            public CreditCard(float b) {
                balance = b;
            }

            public void charge(float amount) {
                balance = balance + amount;
                points = (float) (amount * 0.01);
            }

            public void makePayment(float amount) {
                balance = balance - amount;
            }

            public void print() {
                System.out.println("Balance: " + balance);
                System.out.println("Points: " +  points);
            }
        }


    }
}
