package com.infoshareacademy.mateuszmazur.task01;

public class Main {

    public static void main(String[] args) {

        Country pan = new Country("Polska");
        pan.add(new City("Gdańsk", "Pomorskie", 500000));
        pan.add(new City("Warszawa", "Mazowieckie", 1735000));


        pan.show();


    }
}
