/*
Class: CSE 1321L
Section: W01
Term: Fall 2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Assignment 7A

*/
public class Ball {

    int xPos;
    int yPos;
    int xVELOCITY;
    int yVELOCITY;
    int totMoves;
    int xDirection;
    int yDirection;

//    public Ball(){
//    x = 0;
//    y=0;
//    }

    public Ball(int x, int y, int xV, int yV, int tm) {
        xPos = x;
        yPos = y;
        xVELOCITY = xV;
        yVELOCITY = yV;
        totMoves = tm;
    }


    public void move() {
        xDirection = xVELOCITY;
        yDirection = yVELOCITY;

        for (int i = 0; i < totMoves; i++) {

            if (xPos == 9) {
                xDirection = -xVELOCITY;
            }
            if (xPos == 0){
                xDirection = Math.abs(xVELOCITY);
            }

            xPos = xPos + xDirection;

            if (yPos == 9) {
                yDirection = - Math.abs(yVELOCITY);
            }
            if (yPos <= 0){
                yDirection = + Math.abs(yVELOCITY);
            }

            yPos =yPos + yDirection;

        printPoint();
        }

    }



    public void printPoint(){
        System.out.println("x:" + xPos + " y:" + yPos);
        }
    }




