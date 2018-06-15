package com.infoshareacademy.mateuszmazur.task06;

import java.util.Objects;

public class Person {

    public static final int NAME = 0;
    public static final int SURNAME = 1;
    public static final int AGE = 2;


    private String name;
    private String surname;
    private int age;


    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                Objects.equals(getName(), person.getName()) &&
                Objects.equals(getSurname(), person.getSurname());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getSurname(), getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }


    public static Person fromString(String[] str) {
        String name = str[NAME];
        String surname = str[SURNAME];
        int age = Integer.parseInt(str[AGE]);
        Person p1 = (new Person(name, surname, age));
        return p1;
    }


    public String getName() {return name;}
    public String getSurname() {return surname;}
    public int getAge() {return age;}


}
