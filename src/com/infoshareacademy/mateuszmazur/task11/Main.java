package com.infoshareacademy.mateuszmazur.task11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<String> list = new ArrayList<>();


        list.add("hrhtr");
        list.add("djgtr");
        list.add("zbtr");
        list.add("weqhtr");list.add("gfdhtr");
        list.add("dssshtr");

        Collections.sort(list);


        list.forEach(System.out::println);

    }
}
