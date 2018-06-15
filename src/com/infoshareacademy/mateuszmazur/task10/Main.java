package com.infoshareacademy.mateuszmazur.task10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here


        List<Integer> list = new ArrayList<>();

        for (int i=0;i<10;i++){

            list.add(i);
        }


        Iterator<Integer> listIterator = list.iterator();


        for (int i=0;listIterator.hasNext();i++){



            if (listIterator.next()%2==0){
                listIterator.remove();
            }

        }
        list.forEach(System.out::println);


    }
}
