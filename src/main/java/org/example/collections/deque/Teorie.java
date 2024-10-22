package org.example.collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Teorie {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(1);
        deque.add(2);
        deque.add(0);
        deque.addFirst(10);
        deque.addLast(20);

        for(Integer number : deque) {
            System.out.println(number);
        }

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());

        for(Integer number : deque) {
            System.out.println(number);
        }
    }
}
