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
            List<String> lines = Files.readAllLines(path);
            Set<Person> personSet = createObjectFromList(lines);
            List<Person> personList = new ArrayList<>(personSet);
            Set<String> surnamesSet = new TreeSet<>();

            for (Person s : personSet) {
                surnamesSet.add(s.getSurname());
            }
            List<String> surnamesList = new ArrayList<>(surnamesSet);
            surnamesList.forEach(System.out::println);


            Map<String, List<Person>> map = Person.putIntoMap(surnamesList, personList);

            if (map.containsKey("Tabat"))
                System.out.println(map.get("Tabat"));


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


//            for (int i = 0; i < surnames.size(); i++) {
//
//                List<Person> temp = new ArrayList<>();
//
//
//                for (int j = 0; j < set.size(); j++) {
//
//                    if (surnames.get(i).equals(personList.get(j).getSurname()))
//                        temp.add(personList.get(j));
//                }
//
//
//                map.put(surnames.get(i), temp);
//            }


//    int index =0;
//            for (Person s:personSet){
//
//                    for (String str:surnamesSet){
//
//
//                    if (str.equals(s.getSurname()){
//
//                    }
//                    }
//                    }