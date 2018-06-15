package com.infoshareacademy.mateuszmazur.task01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Country pan = new Country("Polska");
        pan.add(new City("Gdańsk", "Pomorskie", 500000));
        pan.add(new City("Warszawa", "Mazowieckie", 1735000));
        pan.add(new City("Warszawa", "Mazowieckie", 1735000));


        System.out.println(pan.toString()+"\n");


        List<City> cit = new ArrayList<>();


        cit.add(new City("Gdańsk", "Pomorskie", 500000));
        cit.add(new City("Warszawa", "Mazowieckie", 1735000));
        cit.add(new City("Aarszawa", "Mazowieckie", 1335000));



        cit.forEach(System.out::println);
        Collections.sort(cit);
        System.out.println();
        cit.forEach(System.out::println);

        cit.sort((Comparator.comparingInt(City::getPopulation)));
        System.out.println();

        cit.forEach(System.out::println);
    }
}
