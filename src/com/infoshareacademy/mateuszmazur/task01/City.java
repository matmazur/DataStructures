package com.infoshareacademy.mateuszmazur.task01;

public class City{
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
        return "City{" +
                "name='" + name + '\'' +
                ", province='" + province + '\'' +
                ", population=" + population +'\'' +
                ", country=" + country.getcountryName() +
                '}';
    }
}
