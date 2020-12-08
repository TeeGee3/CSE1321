/*
Class: CSE 1321L
Section: W01
Term: Fall 2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Lab 12B

*/

class Stock {
    String name;
    String symbol;
    float closingPrice;
    float currentPrice;
    int percent;

    Stock() {
        name = "Google";
        symbol = "GOG";
    }


    Stock(String n, String s) {
        name = n;
        symbol = s;
    }


        String getName(){
            return name;
        }

        String getSymbol () {
            return symbol;
        }

        float setClosingPrice (float closingPrice) {
            return closingPrice;
        }

        float setCurrentPrice (float currentPrice) {
            return currentPrice;
        }

        float getChangePercent (float percent) {
            percent = closingPrice/currentPrice;
            return percent;
        }

         void print () {
            System.out.println(name);
            System.out.println(symbol);
            System.out.println(closingPrice);
            System.out.println(currentPrice);
            System.out.println(percent);
        }
    }


public class Lab12B {
    public static void main(String args[]) {
        Stock goog = new Stock("Google", "GOG");
        Stock msft = new Stock("Microsoft", "MSF");


        goog.setClosingPrice(134.67f);
        goog.setCurrentPrice(131.98f);
        msft.setClosingPrice(156.52f);
        msft.setCurrentPrice(161.22f);
        goog.print();
        msft.print();
    }
}







