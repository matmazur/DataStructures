package com.infoshareacademy.mateuszmazur.task04;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Queue<String> que = new LinkedList<>();

        que.offer("one");
        que.offer("two");
        que.offer("three");
        que.offer("four");
        que.offer("five");

        que.forEach(System.out::println);
        que.poll();
        System.out.println("============");
        que.forEach(System.out::println);
        System.out.println();

        while (que.peek()!=null){
            que.poll();
            que.forEach(System.out::println);
            System.out.println();
        }


    }
}
