/*
Class: CSE 1321L
Section: W01
Term: Fall 2020
Instructor: Keerthi Manchukonda
Name: Taylor Goff
Assignment 6c

*/

import java.text.DecimalFormat;
import java.util.*;

public class Assignment6C {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string:");
        String input = sc.nextLine();
        System.out.print(leetTranslation(input));
        //leetTranslation(input);
    }

    public static String leetTranslation(String input) {


        char alpha[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
        String leet[] = {"4", "B", "(", "D", "3", "Ph", "9", "|-|", "1", "j", "|<", "L", "","|\\|", "0", "P", "Q", "R", "$", "7", "U", "\\/", "", "><", "'/","Z"," "};
        String translation = "";
        String emm = "";
        String ww = "";


        for (int i = 0; i < input.length(); i++) {
            if( input.charAt(i) == 'm'){
               // translation += "/\\";
                emm = "/\\"+ "\\"+"/\\"+"\\";
                translation += emm;
            }
            if ( input.charAt(i) == 'w') {
                ww = "\\"+"\\"+"/\\"+"\\/";
                translation += ww;
            }


            char tmp = input.charAt(i);
            for (int j = 0; j < alpha.length; j++) {
                if (tmp == alpha[j]) {
                    translation += leet[j];


                    //System.out.print("$"+translation);
                }
            }

        }
        return translation;
    }

}


//    char[] alphaArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
//    String[] leetArray = {'4','B','(','D','3', "Ph",'9', "-\\",'1','j', "|<",'L', "/\\/\\","|\\|",'0','P','Q','R','$','7','U', "\\/", "\\/\\/", "><", "'/","Z"," "};
//
//
//
//
//
//    for (int i = 0; i < input.length(); i++) {
//        char target = input.charAt(i);
//
//
//
//        boolean isFound = false;
//        for (int ii = 0; ii < input.length(); ii++) {
//            System.out.print(ii+" ");
//
//            // If we find a match, return true
//            if (myArray[ii] == target)
//                isFound = true; continue;
//        }





