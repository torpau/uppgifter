package com.company;

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
}
