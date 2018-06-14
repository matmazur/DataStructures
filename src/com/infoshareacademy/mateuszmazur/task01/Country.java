package com.infoshareacademy.mateuszmazur.task01;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private int reg;
    private String countryName;



    List<City> cities;

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
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
        cities = new ArrayList<>();
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

}
