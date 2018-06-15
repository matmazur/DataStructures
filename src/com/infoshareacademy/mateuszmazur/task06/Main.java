package com.infoshareacademy.mateuszmazur.task06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static final String fileName = "/home/mateuszmazur/IdeaProjects/StrukturyDanych/src/com/infoshareacademy/mateuszmazur/task06/set.txt";

    public static void main(String[] args) {
        // write your code here

        Path path = Paths.get(fileName);

        try {
            List<String> list = Files.readAllLines(path);
            Set<Person> set = createObjectFromList(list);
            list=new ArrayList<Person>() {
            }
            Map<String,List<Person>> map = new TreeMap<>();

            set.forEach(System.out::println);





            Set<String> sur = new TreeSet<>();
            for (Person s : set){
                sur.add(s.getSurname());
            }






            List<String> surnames = new ArrayList<>(sur);
            surnames.forEach(System.out::println);


            for (int i=0;i<surnames.size();i++){

                List <Person> temp = new ArrayList<>();


                for (int j=0;j<set.size();j++){

                    if (surnames.get(i))
                }


                map.put(surnames, )




            }




        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static Set<Person> createObjectFromList(List<String> list) {

        Set<Person> set = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {

            String[] listLineSplit = list.get(i).split(" ");
            set.add(Person.fromString(listLineSplit));

        }
        return set;
    }


}




