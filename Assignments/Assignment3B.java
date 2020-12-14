/*
Class: CSE 1321L
Section: W01
Term: Fall2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Assignment#: 3B
*/

import java.util.Scanner;

public class Assignment3B {
    public static void main(String[] args) {

        int num1;
        int num2;
        char operator;
        int output;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
            num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
            num2 = sc.nextInt();
        System.out.print("Enter the operator to apply: ");
            operator = sc.next().charAt(0);

            switch ( operator) {
            case '*':
                output = num1 * num2;
                System.out.print(output);
                break;

            case '+':
                output = num1 + num2;
                System.out.print(output);
                break;

            case '-':
                output = num1 - num2;
                System.out.print(output);
                break;

            case '/':
                output = num1 / num2;
                System.out.print(output);
                break;

            case '%':
                output = num1 % num2;
                System.out.print(output);
                break;

                default:
                    System.out.println(operator+"not accepted try again");
            }

        }
    }

