package com.infoshareacademy.mateuszmazur.task05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Stack;

public class Main {

    public static final String fileName = "/home/mateuszmazur/IdeaProjects/jjdd4-materialy-oop/StrukturyDanych/src/com/infoshareacademy/mateuszmazur/task05/stos.txt";
    public static final Path path = Paths.get(fileName);

    public static void main(String[] args) {


        try {
            List<String> str = Files.readAllLines(path);


            for (int i = 0; i < str.size(); i++) {
                //*********************************************
                //*********************************************
                if (i == 0) {
                    System.out.println("====TESTS===");
                    System.out.println(str.get(i));
                    System.out.println("\n");
                    continue;
                }

                //*********************************************
                //*********************************************
                Stack<Integer> stack = new Stack<>();
                String[] strings = str.get(i).split(" ");
                System.out.println("======TO-DO===");
                for (String s : strings) {
                    System.out.print(s + " ");
                }
                System.out.println("\n======OUTPUT======");
                //*********************************************
                //*********************************************

                for (int j = 0; j < strings.length; j++) {

                    if (strings[j] != null && strings[j].equals("pop")) {
                        System.out.println("popped element " + stack.pop());

                    } else if (Integer.valueOf(strings[j]) instanceof Integer) {
                        stack.add(Integer.valueOf(strings[j]));
                        System.out.println("added element to stack " + strings[j]);
                    }
                }
                System.out.println("\n");
                System.out.println("elementy stosu:");
                stack.forEach(System.out::println);
                System.out.println("\n");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
