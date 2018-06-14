package com.infoshareacademy.mateuszmazur.task02;

import java.util.Random;

public class Main2 {

    public static void main(String[] args) {


        Random rand = new Random();
        double[] tab = new double[5];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextDouble();
            System.out.println(tab[i]);

        }


        double temp=tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (temp < tab[i])

                temp = tab[i];
        }

        System.out.println("najwiekszy number: " + temp);


    }
}
