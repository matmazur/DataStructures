package com.infoshareacademy.mateuszmazur.task12;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            long timeStart = System.currentTimeMillis();
            System.out.println(method(i));
            long timeStop = System.currentTimeMillis() - timeStart;
            System.out.println("[" + i + "]=>]" + 0 + timeStop);
        }


    }


    public static BigInteger method(long n) {


        if (n == 0) {
            return BigInteger.ZERO;
        }


        else if (n == 1){
            return BigInteger.ONE;
        }

                if (method)




        long[] F = new long[1009];
        F[0] = 0;
        F[1] = 1;

        int i = 0;

        for (i = 2; i < n; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }


        return F[i - 1];
    }

}
