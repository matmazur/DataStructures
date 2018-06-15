package com.infoshareacademy.mateuszmazur.task01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Country {
    private int reg;
    private String countryName;



    private Set<City> cities;

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }

    public String getcountryName() {
        return countryName;
    }

    public void setcountryName(String countryName) {
        this.countryName = countryName;
    }

public  Country(){}

    public Country(String countryName) {
        this.countryName = countryName;
        cities = new HashSet<>();
        reg = 0;
    }


    public void add(City cit) {
        cities.add(cit);
        reg++;
        cit.setCountry(this);

    }

    public void show (){
        for (City c:cities) {
            if (c!=null)
            System.out.println(c.toString());

        }
    }


    @Override
    public String toString() {
        return "[" + countryName + "]" +
                "\nCities:\n" + cities;
    }
}
