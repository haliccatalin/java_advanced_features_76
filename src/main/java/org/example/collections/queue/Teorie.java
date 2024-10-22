package org.example.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Teorie {
    // First IN -> First OUT => FIFO
    public static void main(String[] args) {
        Queue<String> events = new LinkedList<>();

        // adauga un element in queue
//        events.add("Event 1");

        events.offer("Event 1");
        events.offer("Event 2");
        events.offer("Event 3");
        events.offer("Event 4");
        events.offer("Event 5");

        // afisare elementelor din queue
        // returneaza primul element din coada
        System.out.println(events.peek());
        System.out.println("Queue size: " + events.size());

        // retuneaza si sterge primul element din coada
        System.out.println(events.poll());
        System.out.println("Queue size: " + events.size());

//        events.clear();

//        System.out.println(events.remove());

        for (String item : events) {
            System.out.println(item);
        }


    }
}
