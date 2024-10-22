package org.example.collections.exercises;

import com.sun.source.tree.Tree;

import java.util.*;

/*
Exercise: Merging Two Lists
Objective: Merge two lists and remove duplicates.
Task:

Create two lists of integers, one containing even numbers and another containing odd numbers.
Merge these lists into a single list.
Ensure no duplicates exist in the final list.
Display the merged list in ascending order.
 */
public class Ex2 {
    public static void main(String[] args) {
        List<Integer> numerePare = new ArrayList<>();
        numerePare.add(2);
        numerePare.add(2);
        numerePare.add(4);
        numerePare.add(6);

        List<Integer> numereImpare = new ArrayList<>();
        numereImpare.add(3);
        numereImpare.add(3);
        numereImpare.add(7);
        numereImpare.add(3);
        numereImpare.add(9);

        List<Integer> finalList = new ArrayList<>();

        //variante 1
        finalList.addAll(numerePare);
        finalList.addAll(numereImpare);

        Set<Integer> finalSet = new TreeSet<>();
        finalSet.addAll(finalList);

        System.out.println("Varianta 1");
        for (Integer number : finalSet) {
            System.out.println(number);
        }

        // reinitializare pentru varianta 2
        finalSet = new TreeSet<>();

        // varianta 2
        for(int i = 0; i < numerePare.size(); i++) {
            // luam elementul de pe pozitia i din lista
            Integer nr = numerePare.get(i);

            if(finalList.contains(nr)) {
                finalList.add(nr);
            }
        }

        for(int i = 0; i < numereImpare.size(); i++) {
            // luam elementul de pe pozitia i din lista
            Integer nr = numereImpare.get(i);

            if(finalList.contains(nr)) {
                finalList.add(nr);
            }
        }

        // sortarea numerelor din lista
        Collections.sort(finalList);

        // afisare lista finala
        System.out.println("Varianta 2");
        for(Integer nr : finalList) {
            System.out.println(nr);
        }
    }
}
