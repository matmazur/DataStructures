package com.infoshareacademy.mateuszmazur.task03;

import java.util.*;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 4));


        System.out.println(list.get(1));
        System.out.println(list.remove(1));
        System.out.print("\n============================\n");
        list.forEach(System.out::println);
        System.out.print("\n============================\n");
        Random rand = new Random();

        List<Integer> list2 = new LinkedList<>();


        for (int i=0;i<100;i++){
            list2.add(rand.nextInt(11));
        }
        System.out.println(list2.contains(5));
        System.out.println();
        System.out.println(list2.get(1));
        System.out.println();
        list2.remove(1);
        list2.forEach(System.out::println);


    }
}
