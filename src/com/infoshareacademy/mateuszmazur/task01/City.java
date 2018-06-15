package com.infoshareacademy.mateuszmazur.task01;

import java.util.Objects;

public class City {
    private String name;
    private String province;
    private int population;
    private Country country;

    public City(String name, String province, int population) {
        super();
        this.name = name;
        this.province = province;
        this.population = population;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "[name='" + name + '\'' +
                ", province='" + province + '\'' +
                ", population=" + population + "]";
    }


    @Override
    public int hashCode() {
        return Objects.hash(name + province + population);
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof City)) return false;

        City city = (City) o;

        return city.getName().equals(getName()) &&
                city.getProvince().equals(getProvince()) &&
                city.getPopulation() == getPopulation();
    }
}
