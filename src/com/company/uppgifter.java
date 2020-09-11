package com.company;
import java.util.Scanner;

public class uppgifter {
    //https://www.w3resource.com/java-exercises/basic/index.php

    static void uppg9() {
        double result = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(result);
        // Expected Output 2.138888888888889
    }


    static void uppg10() {
        double result = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(result);
        //Expected Output 2.9760461760461765
    }


    static void uppg11() {
        double R = 7.5;
        double P = Math.PI * (2*R);
        double A = Math.PI * Math.pow(R,2);

        System.out.println(P);
        System.out.println(A);
        /*
        Expected Output
        Perimeter is = 47.12388980384689
        Area is = 176.71458676442586
        */
    }


    static void uppg12() {
        System.out.println("Type in three numbers.\nPlease press 'ENTER' after each input.");

        Scanner myInput = new Scanner(System.in);

        double no1 = myInput.nextDouble();
        double no2 = myInput.nextDouble();
        double no3 = myInput.nextDouble();

        double result = (no1 + no2 + no3) / 3;

        System.out.println("The average of your numbers is: " + result);
    }


    static void uppg13() {
        //Test Data: Width = 5.5 Height = 8.5
        double x = 5.6;
        double y = 8.5;

        double A = x * y;
        double P = 2 * (x + y);

        System.out.println("Area is " + x + " x " + y + " = " + A);
        System.out.println("Perimeter is 2 * (" + x + " + " + y + ") = " + P);


        /* Expected Output
        Area is 5.6 * 8.5 = 47.60
        Perimeter is 2 * (5.6 + 8.5) = 28.20 */
    }

    static void uppg14() {

        boolean first = false;

        for(int i=0; i<9; i++) {
            if(first==false) {
                System.out.println("* * * * * * ==================================");
                first = true;
            } else {
                System.out.println(" * * * * *  ==================================");
                first = false;
            }
        }
        for(int i=0; i<6; i++) {
            for(int x=0; x<46; x++) {
                System.out.print('=');
            }
            System.out.print('\n');
        }

    }


    static void uppg15() {
        int a = 66;
        int b = 99;

        System.out.println("innan bytet:");
        System.out.println(a + ":" + b);

        int z = a;
        a = b;
        b = z;

        System.out.println("efter bytet:");
        System.out.println(a + ":" + b);
    }


    static void uppg16() {
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
    }

}
